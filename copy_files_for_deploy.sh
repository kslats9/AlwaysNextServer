# run this to set up your app engine project to deploy the client
# make sure to set CLIENT_ROOT and SERVER_ROOT for your machine

CLIENT_ROOT=/Users/personal/side-project/
SERVER_ROOT=/Users/personal/AlwaysNextServer/
echo 'CLIENT_ROOT: ' $CLIENT_ROOT
echo 'SERVER_ROOT: ' $SERVER_ROOT

mkdir -p $SERVER_ROOT'alwaysnext/src/main/webapp/bower_components'
cp -vR $CLIENT_ROOT'app/bower_components/html5-boilerplate' $SERVER_ROOT'alwaysnext/src/main/webapp/bower_components/' 
cp -v  $CLIENT_ROOT'app/cards.json' $SERVER_ROOT'alwaysnext/src/main/webapp/'
cp -v  $CLIENT_ROOT'app/index.html' $SERVER_ROOT'alwaysnext/src/main/webapp/'
cp -vR $CLIENT_ROOT'app/js' $SERVER_ROOT'alwaysnext/src/main/webapp/'
mkdir -p $SERVER_ROOT'alwaysnext/src/main/webapp/style'
cp -vR $CLIENT_ROOT'app/style/stylesheets' $SERVER_ROOT'alwaysnext/src/main/webapp/style/' 
cp -vR $CLIENT_ROOT'app/ui' $SERVER_ROOT'alwaysnext/src/main/webapp/'

# this part modifies index.html to use the minified angular libraries
sed -i '' 's/angular.js/angular.min.js/' $SERVER_ROOT'alwaysnext/src/main/webapp/index.html'
sed -i '' 's/angular-route.js/angular-route.min.js/' $SERVER_ROOT'alwaysnext/src/main/webapp/index.html'
sed -i '' 's/angular-resource.js/angular-resource.min.js/' $SERVER_ROOT'alwaysnext/src/main/webapp/index.html'
sed -i '' 's/angular-animate.js/angular-animate.min.js/' $SERVER_ROOT'alwaysnext/src/main/webapp/index.html'
