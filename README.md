# springboot


1. installing springbootapplication from google cloud console
./mvnw clean install 

2. running springbootapplication from google cloud and opening web browser of google cloud
java -jar demo-0.0.1-SNAPSHOT.jar

3. creating docker image and putting in container registry from google cloud console
./mvnw com.google.cloud.tools:jib-maven-plugin:build -Dimage=gcr.io/$GOOGLE_CLOUD_PROJECT/demo

4. login to cluster to get image and run
gcloud container clusters get-credentials cluster-1 --zone us-central1-c

5. run some command
kubectl get pods, kubectl get services, kubectl get deployment

6. running through docker image and opening web browser of google cloud
docker run -ti --rm -p 8888:8888 gcr.io/$GOOGLE_CLOUD_PROJECT/demo

7. creating deployment and pod
kubectl create deployment demo --image=gcr.io/$GOOGLE_CLOUD_PROJECT/demo --port=8888

8. expose deployment as service
kubectl expose deployment demo --type=LoadBalancer

9. external ip has been created with kubectl get services use that ip and access web application

10. for scale :
kubectl scale  deployments demo --replicas=3


Deployment through kube.yml file 
create yml with deployment and service
kubectl apply -f kube.yml
