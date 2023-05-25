<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<section>
    <div class="container">
        <div class="row">
            <div class="col-lg-6 col-md-9 col-sm-12 join-form">
                <div class="titlebox">
                    회원가입
                </div>
                <form action="${pageContext.request.contextPath}/user/userJoin" method="post" name="joinForm">
                    <div class="form-group">
                        <label for="id">아이디</label>
                        <div class="input-group">
                            <input type="text" name ="userId" class="form-control" id="userId" placeholder="아이디를 (영문포함 4~12자 이상)">
                            <div class="input-group-addon">
                                <button type="button" class="btn btn-primary" id="idCheckBtn">아이디중복체크</button>
                            </div>
                        </div>
                        <span id="msgId"></span>
                    </div>
                    <div class="form-group">
                        <label for="password">비밀번호</label>
                        <input type="password" name="userPw" class="form-control" id="userPw"
                            placeholder="비밀번호 (영 대/소문자, 숫자 조합 8~16자 이상)">
                        <span id="msgPw"></span>
                    </div>
                    <div class="form-group">
                        <label for="password-confrim">비밀번호 확인</label>
                        <input type="password" class="form-control" id="pwConfirm" placeholder="비밀번호를 확인해주세요.">
                        <span id="msgPw-c"></span>
                    </div>
                    <div class="form-group">
                        <label for="name">이름</label>
                        <input type="text" name="userName" class="form-control" id="userName" placeholder="이름을 입력하세요.">
                    </div>
                    <div class="form-group">
                        <label for="hp">휴대폰번호</label>
                        <div class="input-group">
                            <input type="text" name="userPhone1" class="form-control phone1" id="userPhone1" placeholder="ex)010">
                            <input type="text" name="userPhone2" class="form-control phone2" id="userPhone2" placeholder="번호를 입력해주세요">
                        </div>
                    </div>
                    <div class="form-group email-form">
                        <label for="email">이메일</label><br>
                            <div class="input-group">
                                <input type="text" name="userEmail1" class="form-control" id="userEmail1" placeholder="이메일">
                                <select name="userEmail2" class="form-control" id="userEmail2">
                                    <option>@naver.com</option>
                                    <option>@daum.net</option>
                                    <option>@gmail.com</option>
                                    <option>@hanmail.com</option>
                                    <option>@yahoo.co.kr</option>
                                </select>
                                <div class="input-group-addon">
                                	<button type="button" id="mail-check-btn" class="btn btn-primary">이메일 인증</button>
                                </div>
                            </div>
                    </div>
                    <div class="mail-check-box">
                        <input type="text" class="form-control mail-check-input" placeholder="인증번호 6자리를 입력하세요."
                            maxlength="6" disabled="disabled">
                        <span id="mail-check-warn"></span>
                    </div>


                    <!--readonly 속성 추가시 자동으로 블락-->
                    <div class="form-group">
                        <label for="addr-num">주소</label>
                        <div class="input-group">
                            <input type="text" name="addrZipNum" class="form-control" id="addrZipNum" placeholder="우편번호" readonly>
                            <div class="input-group-addon">
                                <button type="button" class="btn btn-primary" onclick="searchAddress()">주소찾기</button>
                            </div>
                        </div>
                    </div>
                    <div class="form-group">
                        <input type="text" name="addrBasic" class="form-control" id="addrBasic" placeholder="기본주소">
                    </div>
                    <div class="form-group">
                        <input type="text" name="addrDetail" class="form-control" id="addrDetail" placeholder="상세주소">
                    </div>

                    <!--button탭에 들어가서 버튼종류를 확인한다-->
                    <div class="form-group">
                        <button type="button" id="joinBtn" class="btn btn-lg btn-success btn-block">회원가입</button>
                    </div>

                    <div class="form-group">
                        <button type="button" id="loginBtn" class="btn btn-lg btn-info btn-block">로그인</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</section>

<script>

    //아이디 중복체크버튼 이벤트
    document.getElementById('idCheckBtn').onclick = function(){
        const msgId = document.getElementById('msgId')
        const id = document.getElementById('userId').value;
        if(id === ''){
            alert('아이디를 입력해주세요.');
        }
        else{
        	fetch('${pageContext.request.contextPath}/user/idCheck',
                    {
                        method: 'post',
                        headers: {
                            'Content-type': 'text/plain'
                        },
                        body: id
                    })
                    .then (res => res.text())
                        .then(data => {
                            if(data === '1'){
                            	msgId.textContent = '이미 사용중인 아이디.'
                                console.log(data);
                            }
                            else {
                            	msgId.textContent = '사용 가능한 아이디.'
                                console.log(data);
                            }
                        })
        }

        

       

    }

    document.getElementById('joinBtn').onclick = function(){
        document.joinForm.submit();
    } 

</script>