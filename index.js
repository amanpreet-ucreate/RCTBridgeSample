/**
 * @format
 */

import { AppRegistry } from 'react-native';
import App from './App';
import { name as appName } from './app.json';
import RCTNativeModule from './src/RCTBridgeSumNativeModule';

AppRegistry.registerComponent(appName, () => RCTNativeModule);
