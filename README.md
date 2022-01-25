Steps to reproduce:

1. Verify that everything works first `./gradlew compileJava`
2. Remove spring plugin(s) from one of the subprojects
3. Verify that gradle fails to resolve now

```
An exception occurred applying plugin request [id: 'com.jfrog.artifactory', version: '4.26.2']
> Failed to apply plugin class 'org.jfrog.gradle.plugin.artifactory.ArtifactoryPlugin'.
   > Cannot cast object 'org.jfrog.gradle.plugin.artifactory.dsl.ArtifactoryPluginConvention@44567643' with class 'org.jfrog.gradle.plugin.artifactory.dsl.ArtifactoryPluginConvention' to class 'org.jfrog.gradle.plugin.artifactory.dsl.ArtifactoryPluginConvention'
```
