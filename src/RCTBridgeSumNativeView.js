//  Created by react-native-create-bridge

import React, { Component } from 'react'
import { requireNativeComponent } from 'react-native'

const RCTBridgeSum = requireNativeComponent('RCTBridgeSum', RCTBridgeSumView)

export default class RCTBridgeSumView extends Component {
  render () {
    return <RCTBridgeSum {...this.props} />
  }
}

RCTBridgeSumView.propTypes = {
  exampleProp: React.PropTypes.any
}
