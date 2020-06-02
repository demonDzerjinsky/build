1. настроить им€ хоста в локальном файле hosts:
192.168.99.100 cdb-dev

2. выкачать проект с github:  
git clone git@github.com:demonDzerjinsky/build.git


3. зайти в папку проекта и подн€ть контейнер

docker build . -t cdb-ptd-img

docker run -it --rm --name cdb-ptd-service -p 8080:8080 cdb-ptd-img 