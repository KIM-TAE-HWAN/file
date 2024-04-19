// <script> 태그 안쪽을 표현

function rev(n) {
    let result = 0;

    while (n != 0) {
        result = result * 10 + n % 10;

        n = parseInt(n/10);
    }

    return result;
}

function fill(div) {
    return function() {
        div.style.backgroundColor = 'red';
    }
    
}

let stu = {
    name : '홍길동',
    kor : 70,
    eng : 80,
    mat : 75,

    show : function() {
        let msg =
            `<li>${this.name}</li> <li>국 ${this.kor}</li>` +
            `<li>영 ${this.eng}</li> <li>수 ${this.mat}</li>`;
        
        return msg;
    },

    total : function() {
        total = this.kor + this.eng + this.mat;

        return total;
    }
}