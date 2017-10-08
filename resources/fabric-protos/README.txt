1. protos directory from fabric Git repo 

http://scriptedonachip.com/git-sparse-checkout

jc@kepler:~/Work/fabric$ git init
jc@kepler:~/Work/fabric$ git remote add origin -f https://github.com/hyperledger/fabric.git
jc@kepler:~/Work/fabric$ git config core.sparsecheckout true
jc@kepler:~/Work/fabric$ echo "protos/*" >> .git/info/sparse-checkout
jc@kepler:~/Work/fabric$ git pull --depth=2 origin master

2. Replace deprecated ValueOf call to forNumber in generated Java files
