1. ��������� ��� ����� � ��������� ����� hosts:
192.168.99.100 cdb-dev

2. �������� ������ � github:  
git clone git@github.com:demonDzerjinsky/build.git


3. ����� � ����� ������� � ������� ���������

docker build . -t cdb-ptd-img

docker run -it --rm --name cdb-ptd-service -p 8080:8080 cdb-ptd-img 

4. ����������� �� ��������:
http://cdb-dev:8080/api/kin/
