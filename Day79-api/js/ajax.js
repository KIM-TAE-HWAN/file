// 1. GET
const url = "http://localhost:8080/Day79/board";

fetch(url, {method : 'get'})
.then(response => response.json())
.then(data => {
    let msg = '';
    // console.log(data);
    for (let i = 0; i < data.length; i++) {
        // console.log(`${i} : ${data[i].title}`);
        msg  +=
            `<tr>` + 
                `<td>${data[i].idx}</td>` +
                `<td>${data[i].title}</td>` +
                `<td>${data[i].contents}</td>` +
                `<td>${data[i].v_count}</td>`  +
                `<td>${data[i].w_date}</td>`  +
                `<td>${data[i].user_idx}</td>` +
                `<td>${data[i].nick}</td>` +
            `</tr>`;
    }

    document.querySelector('tbody').innerHTML = msg;
});

// POST, PATCH, DELETE
let btns = document.querySelectorAll('button');

// 2. POST
btns[0].onclick = () => {
    // alert('POST 누름');
    let title = prompt("제목");
    let contents = prompt("내용");
    let user_idx = Number(prompt("계정번호"));
    
    fetch(url, {
        method:'POST',
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify({
            "title": title,
            "contents": contents,
            "user_idx": user_idx
        })
    })
    .then(response => {
        // console.log(`응답 : ` + response.status);
        let code = response.status;

        if(code == 200) {
            alert('작성 완료');
        }
        else {
            alert('작성 실패');
        }
    })
};

// 3. PATCH
btns[1].onclick = () => {
    // alert('PATCH 누름');

    btns[1].onclick = () => {
        let idx = Number(prompt("수정할 번호"));
        let title = prompt("제목");
        let contents = prompt("내용");
        
        fetch(url, {
            method: 'PATCH',
            headers: {
                "Content-Type": "application/json"
            },
            body: JSON.stringify({
                "idx":idx,
                "title":title,
                "contents":contents
            })
        })
        .then(response => {
            let code = response.status;

            if(code == 200) {
                alert('수정완료');
            }
            else {
                alert('수정 실패');
            }

        });
    };
    
};

// 4. DELETE
btns[2].onclick = () => {
    //alert('DELETE 누름');

    btns[2].onclick = () => {
        let idx = Number(prompt('삭제할 번호'));

        if (idx == 0) {
            alert('값을 입력하지 않았습니다')
            return;
        }

        fetch(url + `?idx=${idx}`, { method: 'DELETE' })
        .then(response => {
            let code = response.status;

            if(code == 200) {
                alert('삭제완료');
            }
            else {
                alert('삭제 실패');
            }
        })
}};