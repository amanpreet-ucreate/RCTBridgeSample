//  Created by react-native-create-bridge

import React from 'react';
import { View, Text, TouchableOpacity, NativeModules } from 'react-native'

const { RCtBridgeSum } = NativeModules;

export default class RCTNativeModule extends React.PureComponent {
  constructor() {
    super()
    this.state = {
      sumValue: ''
    }
  }


  addNumbers = () => {

    // RCtBridgeSum.showValue((value) => {
    //   this.setState({ sumValue: value });
    // })

    RCtBridgeSum.sumTwo(10, 50, (value) => {
      this.setState({ sumValue: value });
    })

  }


  render() {
    return (
      <View style={{ marginTop: 50 }}>
        <Text>
          Value is: {this.state.sumValue}
        </Text>
        <TouchableOpacity onPress={this.addNumbers}>
          <Text>Click me!</Text>
        </TouchableOpacity>
      </View>
    );
  }
}