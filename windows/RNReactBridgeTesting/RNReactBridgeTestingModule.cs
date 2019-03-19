using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace React.Bridge.Testing.RNReactBridgeTesting
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNReactBridgeTestingModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNReactBridgeTestingModule"/>.
        /// </summary>
        internal RNReactBridgeTestingModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNReactBridgeTesting";
            }
        }
    }
}
