import React, { useState } from 'react';
import { Text, View, Button, StyleSheet } from 'react-native';

const App = () => {
  const [count, setCount] = useState(0);
  return (
    <View style={styles.container}>
      <Text>
        Você clicou {count} vezes {'\n'}{' '}
      </Text>
      <Button onPress={() => setCount(count + 1)} title="CLique aqui"></Button>
    </View>
  );
};

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
  },
});

export default App;
