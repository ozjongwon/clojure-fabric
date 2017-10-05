# Clojure-fabric, Hyperledger Fabric SDK for Clojure
This is my own reference implementation of [Fabric SDK Design Spec](https://docs.google.com/document/d/1R5RtIBMW9fZpli37E5Li5_Q9ve3BnQ4q3gWmGZj6Sv4)

## Status
This is no longer a Java SDK wrapper, I decided to implement from scratch.

### Status Update
Basic modules done, some Crypto stuff.

### Initial idea - failed
Generating Clojure files from Java SDK. Class inheritance has to be implemented manually in Clojure world.
And it is not worth to pursue with limited time and efforts I can make.
I realized the problem while I play with 'fabcar' example.

### Alternative idea - failed
I tried an alternative method, dynamically constructing things at runtime using reflection.
After spending a couple of hours, I found the alternative way won't work either.
Java implementation does not provide consistent constructors and marshalling/unmarshalling has to be done manually.

### Current implemetation idea
Write a native Clojure SDK.

## License
Copyright &copy; 2017 Jong-won Choi. 

Licensed under the Apache License, Version 2.0 (the "License")