# Clojure-fabric, Hyperledger Fabric SDK for Clojure using Java SDK

Clojure-fabric is a Clojure wrapper of [Hyperledger Fabric SDK Java](https://github.com/hyperledger/fabric-sdk-java).

## Status

### Initial idea - failed
Generating Clojure files from Java SDK. Class inheritance has to be implemented manually in Clojure world.
And it is not worth to pursue with limited time and efforts I can make.
I realized the problem while I play with 'fabcar' example.

### Alternative idea - failed
I tried an alternative method, dynamically constructing things at runtime using reflection.
After spending a couple of hours, I found the alternative way won't work either.
Java implementation does not provide consistent constructors and marshalling/unmarshalling has to be done manually.

### Next step
Back to the first option and add some workaround code or write a pure native SDK.

## License
Copyright &copy; 2017 Jong-won Choi. 

Licensed under the Apache License, Version 2.0 (the "License")