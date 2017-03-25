= Initial setup =
* Link /home/vvasuki/.android/sbt/sdk to android sdk folder.
* Edit local.properties and add key info - but don't check it in.

= Quick sbt commands
    * app/android:run
    * app/android:packageRelease

= Help links
* <http://scala-on-android.taig.io/publishing/>
* <http://scala-android.org/dependencies/>
* <https://gitter.im/scala-android/sbt-android>

= Historical notes
* I started developing a java android app ( https://github.com/sanskrit-coders/subhAShita-pratimAlA ) on android studio, but decided to switch to scala .
* I followed the instructions (https://github.com/scala-android/sbt-android/blob/master/GRADLE.md / http://scala-android.org/setup/ ) and successfully imported it to sbt.
  * I was able to run the skeleton app on my phone using the command line interface.
* But I wanted to use an IDE. So I started following http://scala-on-android.taig.io/introduction/ and http://scala-android.org/ide_integration/ .
  * Running sbt with this did not work.