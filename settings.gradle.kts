plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}
rootProject.name = "game-family"
include("game-werewolf", "game-common")
include("game-dal")
include("game-player")
