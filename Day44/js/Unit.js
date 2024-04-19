class Unit {
    constructor(name, hp, atk) {
        this.name = name;
        this.hp = hp;
        this.atk = atk;
    }

    show() {
       return `직업 ${this.name} hp ${this.hp} atk ${this.atk}` ;
    }

    attack(target) {
        if (target instanceof Unit) {
            console.log(`${this.name} is attacking ${target.name}`);
            target.takeDamage(this.atk);
        } else {
            console.log(`Invalid target for attack`);
        }
    }

    takeDamage(damage) {
        this.hp -= damage;
        console.log(`${this.name} took ${damage} damage. Current HP: ${this.hp}`);
    }
}