# Clojure-fabric, Hyperledger Fabric SDK for Clojure using Java SDK

Clojure-fabric is a Clojure wrapper of Hyperledger Fabric SDK.

## Status

Generating Clojure files from Java SDK has flaws
and it is not worth to pursue with limited time and efforts I can make.

The problem is: Clojure does not support OOP well, and I have to construct missing parts by myself.
I realized the problem while I play with 'fabcar' example.

I'm going to try an alternative method, dynamically constructing things at runtime using reflection.

## License
Copyright &copy; 2017 Jong-won Choi. 

Licensed under the Apache License, Version 2.0 (the "License")