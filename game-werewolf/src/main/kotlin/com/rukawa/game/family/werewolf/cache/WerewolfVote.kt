package com.rukawa.game.family.werewolf.cache

/**
 * 狼人杀投票
 */
class WerewolfVote {

    /**
     * 投票轮次
     */
    var voteRotation: Int = 0

    /**
     * 投票的座位序号
     */
    var voteSeatOrder: Int? = null

    /**
     * 被投票的座位序号
     */
    var beVoteSeatOrder: Int? = null

}