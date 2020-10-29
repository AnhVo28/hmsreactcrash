/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 * @flow strict-local
 */

import React, {Component} from 'react';
import {
  SafeAreaView,
  StyleSheet,
  ScrollView,
  View,
  Text,
  StatusBar,
  NativeModules,
  Button
} from 'react-native';

import {
  Header,
  LearnMoreLinks,
  Colors,
  DebugInstructions,
  ReloadInstructions,
} from 'react-native/Libraries/NewAppScreen';


const styles = StyleSheet.create({
  scrollView: {
    backgroundColor: Colors.lighter,
  },
  body: {
    backgroundColor: Colors.white,
    alignItems: 'center',
    paddingVertical: 100 

  },
  text: {
    marginBottom: 15
  }
  
});

export default class App extends Component { 

  render() {
    return (
    <>
      <StatusBar barStyle="dark-content" />
      <SafeAreaView>
        <ScrollView
          contentInsetAdjustmentBehavior="automatic"
          style={styles.scrollView}>
          <Header />
         
          <View style={styles.body}>


            <Text style={styles.text}> Please click button to go to test page</Text>

            <Button
                
                onPress={() => NativeModules.ActivityStarter.navigateToExample()}
                title='Go to test crash activity'
            />
         
          </View>
        </ScrollView>
      </SafeAreaView>
    </>
  );
};

}



