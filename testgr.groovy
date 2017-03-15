node('local') {
git url: 'https://github.com/dillsvarma/thisone.git'
stage '\u2776 Stage 1'
echo "\u2600 stage 1 entering"
 
def workspace = pwd()
echo "\u2600 workspace=${workspace}"
 
stage '\u2777 Stage 2'
echo "\u2600 stage 1 entering"
 sh "/usr/share/maven/bin/mvn clean package"
} // node
