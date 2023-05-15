# Battle of the frameworks : Quarkus vs SpringBoot tech talk resources

Supplementary code and resources for Devoxx May 2023, the event that was performed in Greece. Code for Spring and Quarkus developed by Red Hat's https://github.com/geoand

The talk was named **Battle of the frameworks : Quarkus vs SpringBoot**

- [Event information](https://devoxx.gr/talk/?id=5656)
- [Presentation Video](https://www.youtube.com/watch?v=Cq_YiZQRh9E)
- [Presentation Slides](https://www.slideshare.net/ChristosSotiriou/battle-of-the-frameworks-quarkus-vs-springboot)

This package contains a Spring and Quarkus application that do the same thing. During the presentation, Georgios Andrianakis essentially constructed those applications live. They are also given here for anyone's convenience.

There are also Dockerfiles included, that allow us to build both applications and push them to a Docker registry. 

The Dockerfiles were used to push the images to the public docker registry, so that they could be used with microk8s 

### How the tests were performed
- Installed Microk8s
- Installed k6 in the machine https://k6.io
- Built and pushed the images to the docker registry
- Deployed the applications in microk8s using [The deployment file](./loadtesting/deployment.yaml)
- Used the scripts inside [the loadtesting folder](./loadtesting) to run the load tests using k6
