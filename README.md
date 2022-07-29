# Features
* Hot reload of configuration in spring through configmaps.
* Fast local dev lifecycle with file watching through skaffold.
* Possibility to add other dependencies to the skaffold build to run on a local K8s cluster, similar to docker compose.
* Demo uses spring but anything that can run in a container can benefit from these tools.

# Tools
- minikube is a simple way to run kubernetes clusters locally. we use kubernetes on the cloud so it makes sense to run a similar setup when developing locally.
- skaffold is a tool to aid with kubernetes local development. it mainly consists of a yaml definition which is sort of in between a docker compose and a ci pipeline. in dev mode it watches changes constantly to give us a great feedback loop. testcontainers with kind.
- configmaps are simply a kubernetes object which stores literal data. since it’s kubernetes native it benefits from its crossplane and constant reconciliation. spring cloud has very good integration with it which allows us to have live config updates without redeploys.