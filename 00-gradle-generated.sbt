// AUTO-GENERATED SBT FILE, DO NOT MODIFY

val app = project.in(
  file("/home/vvasuki/subhAShita-pratimAlA/app")
).enablePlugins(AndroidApp).settings(
  packagingOptions in Android := android.Keys.PackagingOptions(Seq("**/*~","/LICENSE","NOTICE","**/.*/**","**/picasa.ini","/META-INF/NOTICE","**/.*","**/.svn/**","AUTHORS","**/_*/**","/LICENSE.txt","**/SCCS/**","/META-INF/LICENCE","/NOTICE.txt","**/about.html","**/thumbs.db","/NOTICE","/META-INF/LICENSE.txt","**/CVS/**","**/_*","**/package.html","/META-INF/NOTICE.txt","LICENSE","**/overview.html"), Nil, Seq("/META-INF/services/**")),
  buildToolsVersion in Android := Some("25.0.0"),
  aaptAdditionalParams in Android ++= Nil,
  lintStrict in Android := true,
  lintFlags in Android := {
      import collection.JavaConverters._
      import com.android.tools.lint.detector.api.Severity
      val flags = lintFlags.value
      flags.getSuppressedIds.addAll(Set.empty.asJava)
      flags.getEnabledIds.addAll(Set.empty.asJava)
      flags.setExactCheckedIds(Set.empty.asJava)
      flags.setFullPath(true)
      flags.setShowSourceLines(true)
      flags.setQuiet(false)
      flags.setCheckAllWarnings(false)
      flags.setIgnoreWarnings(false)
      flags.setWarningsAsErrors(false)
      flags.setExplainIssues(true)
      flags.setShowEverything(false)
      flags.setDefaultConfiguration(null)
      flags.setSeverityOverrides(Map.empty.asJava)
      flags
    }
,
  libraryDependencies ++= List(
    "com.android.support" % "support-media-compat" % "24.2.1" artifacts(Artifact("support-media-compat", "aar", "aar")) intransitive(),
    "com.android.support" % "appcompat-v7" % "24.2.1" artifacts(Artifact("appcompat-v7", "aar", "aar")) intransitive(),
    "com.android.support" % "support-core-ui" % "24.2.1" artifacts(Artifact("support-core-ui", "aar", "aar")) intransitive(),
    "com.android.support" % "support-fragment" % "24.2.1" artifacts(Artifact("support-fragment", "aar", "aar")) intransitive(),
    "com.android.support" % "animated-vector-drawable" % "24.2.1" artifacts(Artifact("animated-vector-drawable", "aar", "aar")) intransitive(),
    "com.android.support" % "multidex" % "1.0.1" artifacts(Artifact("multidex", "aar", "aar")) intransitive(),
    "com.android.support" % "support-vector-drawable" % "24.2.1" artifacts(Artifact("support-vector-drawable", "aar", "aar")) intransitive(),
    "com.android.support" % "support-compat" % "24.2.1" artifacts(Artifact("support-compat", "aar", "aar")) intransitive(),
    "com.android.support" % "support-v4" % "24.2.1" artifacts(Artifact("support-v4", "aar", "aar")) intransitive(),
    "com.android.support" % "support-core-utils" % "24.2.1" artifacts(Artifact("support-core-utils", "aar", "aar")) intransitive(),
    "com.android.support" % "support-annotations" % "24.2.1" intransitive(),
    "com.loopj.android" % "android-async-http" % "1.4.5" intransitive(),
    "org.apache.commons" % "commons-io" % "1.3.2" intransitive(),
    "org.apache.httpcomponents" % "httpcore" % "4.4.6" intransitive()),
  resolvers ++= List(
    "https://jcenter.bintray.com/" at "https://jcenter.bintray.com/",
    "file:/home/vvasuki/android-sdk-linux/extras/m2repository" at "file:/home/vvasuki/android-sdk-linux/extras/m2repository",
    "file:/home/vvasuki/android-sdk-linux/extras/google/m2repository/" at "file:/home/vvasuki/android-sdk-linux/extras/google/m2repository/",
    "file:/home/vvasuki/android-sdk-linux/extras/android/m2repository/" at "file:/home/vvasuki/android-sdk-linux/extras/android/m2repository/",
    "https://jcenter.bintray.com/" at "https://jcenter.bintray.com/"),
  publishMavenStyle := false,
  platformTarget in Android := "android-24",
  name := "app",
  javacOptions in Compile ++= List(
    "-source",
    "1.7",
    "-target",
    "1.7"),
  debugIncludesTests in Android := false,
  projectLayout in Android := 
    new ProjectLayout.Wrapped(ProjectLayout(baseDirectory.value)) {
      override def base = file("/home/vvasuki/subhAShita-pratimAlA/app")
      override def resources = file("/home/vvasuki/subhAShita-pratimAlA/app/src/main/resources")
      override def testSources = file("/home/vvasuki/subhAShita-pratimAlA/app/src/androidTest")
      override def sources = file("/home/vvasuki/subhAShita-pratimAlA/app/src/main")
      override def javaSource = file("/home/vvasuki/subhAShita-pratimAlA/app/src/main/java")
      override def libs = file("/home/vvasuki/subhAShita-pratimAlA/app/src/main/libs")
      override def gen = file("/home/vvasuki/subhAShita-pratimAlA/app/target/android/generated/source")
      override def testRes = file("/home/vvasuki/subhAShita-pratimAlA/app/src/androidTest/res")
      override def manifest = file("/home/vvasuki/subhAShita-pratimAlA/app/src/main/AndroidManifest.xml")
      override def testManifest = file("/home/vvasuki/subhAShita-pratimAlA/app/src/main/AndroidManifest.xml")
      override def scalaSource = file("/home/vvasuki/subhAShita-pratimAlA/app/src/main/scala")
      override def aidl = file("/home/vvasuki/subhAShita-pratimAlA/app/src/main/aidl")
      override def bin = file("/home/vvasuki/subhAShita-pratimAlA/app/target/android")
      override def renderscript = file("/home/vvasuki/subhAShita-pratimAlA/app/src/main/rs")
      override def testScalaSource = file("/home/vvasuki/subhAShita-pratimAlA/app/src/androidTest/scala")
      override def testAssets = file("/home/vvasuki/subhAShita-pratimAlA/app/src/androidTest/assets")
      override def jni = file("/home/vvasuki/subhAShita-pratimAlA/app/src/main/jni")
      override def assets = file("/home/vvasuki/subhAShita-pratimAlA/app/src/main/assets")
      override def testJavaSource = file("/home/vvasuki/subhAShita-pratimAlA/app/src/androidTest/java")
      override def jniLibs = file("/home/vvasuki/subhAShita-pratimAlA/app/src/main/jniLibs")
      override def res = file("/home/vvasuki/subhAShita-pratimAlA/app/src/main/res")
    }
,
  buildConfigOptions in Android ++= Nil,
  resValues in Android ++= Nil,
  proguardOptions in Android ++= Nil,
  manifestPlaceholders in Android ++= Map.empty,
  dexMulti in Android := dexMulti.?.value.getOrElse(false) || true,
  applicationId in Android := "sanskritcode.subhashita_pratimala",
  versionCode in Android := Some(1),
  versionName in Android := Some("1.0"),
  minSdkVersion in Android := "14",
  targetSdkVersion in Android := "24"
).settings(
  buildTypes += (("debug", List(
    buildConfigOptions in Android ++= Nil,
    resValues in Android ++= Nil,
    proguardOptions in Android ++= Nil,
    manifestPlaceholders in Android ++= Map.empty,
    apkbuildDebug in Android := {
      val debug = apkbuildDebug.value
      debug(true)
      debug
    },
    rsOptimLevel in Android := 3,
    useProguardInDebug in Android := false,
    unmanagedSourceDirectories in Compile += file("/home/vvasuki/subhAShita-pratimAlA/app/src/debug/java"),
    extraResDirectories in Android += file("/home/vvasuki/subhAShita-pratimAlA/app/src/debug/res"),
    resourceDirectories in Compile += file("/home/vvasuki/subhAShita-pratimAlA/app/src/debug/resources"),
    extraAssetDirectories in Android += file("/home/vvasuki/subhAShita-pratimAlA/app/src/debug/assets"))))
).settings(
  buildTypes += (("release", List(
    buildConfigOptions in Android ++= Nil,
    resValues in Android ++= Nil,
    proguardOptions in Android ++= Nil,
    manifestPlaceholders in Android ++= Map.empty,
    apkbuildDebug in Android := {
      val debug = apkbuildDebug.value
      debug(false)
      debug
    },
    rsOptimLevel in Android := 3,
    useProguard in Android := false,
    unmanagedSourceDirectories in Compile += file("/home/vvasuki/subhAShita-pratimAlA/app/src/release/java"),
    extraResDirectories in Android += file("/home/vvasuki/subhAShita-pratimAlA/app/src/release/res"),
    resourceDirectories in Compile += file("/home/vvasuki/subhAShita-pratimAlA/app/src/release/resources"),
    extraAssetDirectories in Android += file("/home/vvasuki/subhAShita-pratimAlA/app/src/release/assets"))))
).withExtraProperties

