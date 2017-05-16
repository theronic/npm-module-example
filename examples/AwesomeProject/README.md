# shadow-cljs and react-native + haul

This was created by `react-native init AwesomeProject` and then adding `haul` to replace the default `react-native` packager. The default doesn't handle the generated CLJS code very well as it will run it through various babel transforms. The code will work but it takes forever to process. `haul` just uses webpack and has no such issues.

```
shadow-cljs --once # or --dev
yarn run haul start -- --platform ios
react-native run-ios
```

## Links

- https://facebook.github.io/react-native/docs/getting-started.html
- https://github.com/callstack-io/haul