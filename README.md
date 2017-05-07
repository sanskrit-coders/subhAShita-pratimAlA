# Current status 
* Disabled Instant run as of May 5 2017. 
* After including the jars in libs: Both in intellij and android studio, stuck with:
    * proguard problem if I include sanskritnlpjava jar:
        * `Error:Uncaught translation error: com.android.dx.cf.code.SimException: local variable type mismatch: attempt to set or access a value of type java.lang.Object using a local variable of type java.lang.Object[]. This is symptomatic of .class transformation tools that ignore local variable information.`
    * With maven dependency:
        * `Error:Execution failed for task ':app:transformResourcesWithMergeJavaResForDebug'.> java.util.zip.ZipException: duplicate entry: decoder.properties`

# Historical notes
* I started developing a java android app on android studio, but decided to try [switching to scala](https://github.com/sanskrit-coders/subhAShita-pratimAlA-scala).
* I switched back here because of:
  * various reasons listed in the [scala project readme file](https://github.com/sanskrit-coders/subhAShita-pratimAlA-scala), 
  * Greater community experience with java android development.
