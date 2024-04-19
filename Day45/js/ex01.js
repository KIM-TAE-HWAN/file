class car {
    constructor(model, speed) {
        this.model = model;
        this.speed = speed;
    }

    show() {
        let msg = `${this.model} (${this.speed} km/h)`;
        return msg;
    }

    accel(speed) {
        this.speed += speed;
        return this.speed;
    }
}