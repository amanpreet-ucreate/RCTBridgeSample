
# react-native-react-bridge-testing

## Getting started

`$ npm install react-native-react-bridge-testing --save`

### Mostly automatic installation

`$ react-native link react-native-react-bridge-testing`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-react-bridge-testing` and add `RNReactBridgeTesting.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNReactBridgeTesting.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNReactBridgeTestingPackage;` to the imports at the top of the file
  - Add `new RNReactBridgeTestingPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-react-bridge-testing'
  	project(':react-native-react-bridge-testing').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-react-bridge-testing/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-react-bridge-testing')
  	```

#### Windows
[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `RNReactBridgeTesting.sln` in `node_modules/react-native-react-bridge-testing/windows/RNReactBridgeTesting.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app
  - Add `using React.Bridge.Testing.RNReactBridgeTesting;` to the usings at the top of the file
  - Add `new RNReactBridgeTestingPackage()` to the `List<IReactPackage>` returned by the `Packages` method


## Usage
```javascript
import RNReactBridgeTesting from 'react-native-react-bridge-testing';

// TODO: What to do with the module?
RNReactBridgeTesting;
```
  