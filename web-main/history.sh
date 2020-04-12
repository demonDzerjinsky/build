docker run --rm -p 8080:8080 -p 9990:9990 -it geobank /opt/jboss/wildfly/bin/standalone.sh -b 0.0.0.0 -bmanagement 0.0.0.0

-- interactive start, with console block
docker run --rm -p 8080:8080 -p 9990:9990 -it geobank 

-- current, daemon start
docker run --rm -d -p 8080:8080 -p 9990:9990 -it geobank 

-- experimental with  maximum useful parameters
docker run --rm -d \
  -p 8080:8080 \
  -p 9990:9990 \
  -it geobank \
  -e TZ=Europe/Moscow \
  --mount source=/c/apps/docker/web/deployments/,destination=/opt/jboss/wildfly/standalone/deployments/

--login 
docker exec -ti -u root ContainerID /bin/bash

-- history
docker run --rm -d -p 8080:8080 -p 9990:9990 -e TZ=Europe/Moskow -it geobank 
