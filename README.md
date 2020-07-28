# loosetie - Kubernetes DSL

This is a Kotlin DSL to create Kubernetes manifests in a typesafe and convenient way.

## Usage

### Maven

Replace `K8S_VERSION` with the desired Kubernetes version in the example below.
Copy that snippet to the `dependencies` section of your pom.

    <dependency>
      <groupId>de.loosetie.k8s</groupId>
      <artifactId>lt-k8s-dsl</artifactId>
      <version>1.0.0-K8S_VERSION</version>
    </dependency>

### Kotlin

Now in your code you're able to create Kubernetes manifests by using the `k8sApi { ... }` Function

    import de.loosetie.k8s.dsl.k8sApi
    import de.loosetie.k8s.dsl.util.jackson.Mappers.yamlPrinter

    val manifests = k8sApi {
        // your IDE will tell you, what's possible here
    }
    // the following lines will serialize the manifest definitions to yaml
    maifests.forEach {
      val jsonString = yamlPrinter
        .writeValueAsString(it)
      println(jsonString)
    }

Good starting points are:
* `deployment`: https://kubernetes.io/docs/concepts/workloads/controllers/deployment/
* `statefulset`: https://kubernetes.io/docs/concepts/workloads/controllers/statefulset/
* `job` or `cronjob`: https://kubernetes.io/docs/concepts/workloads/controllers/job/
* `service`: https://kubernetes.io/docs/concepts/services-networking/service/
* `ingress`: https://kubernetes.io/docs/concepts/services-networking/ingress/


### Update Kubernetes version

Just change the version of your `lt-k8s-dsl` dependency, and your compiler will tell you about breaking changes

## Licence

Apache License 2.0, see LICENCE.txt
