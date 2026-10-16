package com.example.lab_6

/**
 * Represents a wizard character that can cast spells using mana.
 *
 * A wizard has a name, current mana, and spell power. The wizard needs
 * enough mana to cast a spell. Spell power determines the spell's damage.
 *
 * @property name the name of the wizard
 * @property mana the current mana available for casting spells
 * @property spellPower the base power used to calculate spell damage
 */
class Wizard(
    val name: String,
    var mana: Int,
    var spellPower: Int
) {
    /**
     * Casts a spell and returns the damage dealt.
     *
     * Supported spells:
     * - "Explosion": costs 10 mana and deals 3 times spell power
     * - "Frostbite": costs 5 mana and deals 2 times spell power
     *
     * If there is not enough mana or the spell name is invalid, the
     * spell fails and returns 0.
     *
     * @param spell the name of the spell to cast
     * @return the damage dealt, or 0 if the spell fails
     */
    fun castSpell(spell: String): Int {
        when (spell) {
            "Explosion" -> {
                if (mana >= 10) {
                    mana -= 10
                    return spellPower * 3
                } else {
                    return 0
                }
            }

            "Frostbite" -> {
                if (mana >= 5) {
                    mana -= 5
                    return spellPower * 2
                } else {
                    return 0
                }
            }

            else -> {
                return 0
            }
        }
    }
}