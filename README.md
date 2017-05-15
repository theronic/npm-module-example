# npm-module-example

Short example of the new `:npm-module` support in `shadow-devtools`.

The goal is to provide a smooth interop with npm related tools, so everything that understand `node_modules` should just work.

## Disclaimer

This feature is currently very alpha and not much more than a proof of concept. The downside is that the Closure Compiler does not work anymore. To some that may be an upside though. Currently there is no REPL but in theory that can work, just need to work out some kinks.

### Instructions

```
git clone https://github.com/thheller/npm-module-example.git
cd npm-module-example

yarn (or npm install)
lein run -m shadow.npm.cli --watch
```

I assume `leiningen` is installed for now, I may create a standalone runner that does not require `lein` or `project.clj`.

After that has running you may either run
```
node index.js
```

Or
```
webpack -d (-w if you want)
```

Or
```
browserify -d index.js -o dist/bundle.js
```

And then `open dist/index.html`.
