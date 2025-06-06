package com.se2gruppe5.risikofrontend.game.dialogues

import android.app.Activity
import com.se2gruppe5.risikofrontend.game.territory.ITerritoryVisual

class DialogueHandler (val activity: Activity) : IDialogueHandler {
    override fun useAttackDialog(
        from: ITerritoryVisual,
        to: ITerritoryVisual,
        attackFun: (Int) -> Unit,
    ) {
        AttackTroopDialog(
            context = activity,
            maxTroops = from.territoryRecord.stat - 1,
            minTroops = 1,
            fromTerritory = from,
            toTerritory = to,
            attackFun = attackFun)
        .show()
    }

    override fun useReinforceDialog(
        from: ITerritoryVisual,
        to: ITerritoryVisual,
    ) {
        MoveTroopDialog(
            context = activity,
            maxTroops = from.territoryRecord.stat - 1,
            minTroops = 2,
            fromTerritory = from,
            toTerritory = to
        ).show()
    }


}
