//  Created by react-native-create-bridge

import Foundation


@objc(RCtBridgeSum)
class RCTBridgeSumManager : NSObject {
  

  // Implement methods that you want to export to the native module
  @objc func sumTwo(_ value : Int , value1: Int,  _callback : RCTResponseSenderBlock) {
    // The bridge eventDispatcher is used to send events from native to JS env
    // No documentation yet on DeviceEventEmitter: https://github.com/facebook/react-native/issues/2819
    let  value = value + value1;
    _callback([value]);
    
  }
  
  @objc func showValue(_ _callback : RCTResponseSenderBlock){
    _callback([234])
  }
}

