package org.telegram.ui

import android.content.Intent
import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.telegram.messenger.Intro
import org.telegram.messenger.MessagesController
import org.telegram.messenger.TestableApplicationLoader
import org.telegram.tgnet.ConnectionsManager
import org.telegram.ui.Components.RLottieDrawable

@RunWith(RobolectricTestRunner::class)
@Config(application = TestableApplicationLoader::class)
class LaunchActivityHandleIntentTest {
  @Before
  fun setUp() {
    MessagesController.isUnderTest = true
    ConnectionsManager.isUnderTest = true
    RLottieDrawable.isUnderTest = true
    Intro.isUnderTest = true
    IntroActivity.isUnderTest = true
  }

  @Test
  fun launchTheActivity() {
    val launchActivity = Robolectric.setupActivity(TestableLaunchActivity::class.java)
    launchActivity.currentAccount = 0

    val handleIntent = launchActivity.handleIntent(Intent(), true, true, true)

    assertThat(handleIntent)
      .isFalse()
  }
}
