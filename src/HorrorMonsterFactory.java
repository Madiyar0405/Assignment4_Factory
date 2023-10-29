class HorrorMonsterFactory implements MonsterFactory {
    public Monster createGoblin() {
        return new Goblin();
    }

    public Monster createDragon() {
        return new Dragon();
    }

    public Monster createZombie() {
        return new Zombie();
    }
}