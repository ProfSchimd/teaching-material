"use strict";
export class Vec3 {
    constructor(x, y, z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    get polar_r() {
        return Math.hypot(this.x, this.y, this.z)
    }

    get polar_theta() {
        return Math.atan2(this.y, this.x);
    }

    get polar_phi() {
        return Math.atan2(Math.hypot(this.x, this.y), this.z);
    }

    get polar() {
        return [this.polar_r, this.polar_phi, this.polar_theta];
    }
}

function test_Vec3() {
    const p1 = new Vec3(1,1,1);
    const p2 = new Vec3(2,3,0);
    console.log(p1);
    console.log(p2);
    console.log(p1.polar);
    console.log(p2.polar);
}

// test_Vec3();

