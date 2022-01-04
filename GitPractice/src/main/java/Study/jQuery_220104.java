package Study;

public class jQuery_220104 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * $() 함수에 전달되는 인수는 반드시 따옴표("")를 사용한 문자열 형태로 전달되어야 합니다. $(function() {
		 * 
		 * $("p").on("click", function() {
		 * 
		 * $("#jq").css("border", "2px solid orange"); // 아이디가 "jq"인 요소를 선택함.
		 * 
		 * });
		 * 
		 * });
		 * 
		 * $(function() {
		 * 
		 * $("p").on("click", function() {
		 * 
		 * $(".jq").css("backgroundColor", "lightgray"); // 클래스가 "jq"인 요소를 모두 선택함.
		 * 
		 * });
		 * 
		 * });
		 * 
		 * 
		 * $(function() {
		 * 
		 * $("button").on("click", function() { // <img>요소 중에서 alt 속성값이 "flower"인 요소를 모두
		 * 선택함.
		 * 
		 * $("img[alt='flower']").attr("src", "/examples/images/img_monalisa.png");
		 * 
		 * });
		 * 
		 * });
		 * 
		 * 
		 * $(function() {
		 * 
		 * var items = $("li"); // <li>요소를 모두 선택하여 변수 items에 저장함.
		 * 
		 * $("button").on("click", function() {
		 * 
		 * $("#len").text("저장된 <li>요소의 총 개수는 " + items.length + "개 입니다.");
		 * 
		 * });
		 * 
		 * });
		 * 
		 * 
		 * $(function() {
		 * 
		 * $("button").on("click", function() {
		 * 
		 * $("li:has(span)").text("<span>요소를 가지고 있는 아이템이에요!");
		 * 
		 * });
		 * 
		 * });
		 * 
		 * 
		 * 
		 * 
		 * :eq(n)	선택한 요소 중에서 인덱스가 n인 요소를 선택함.
			:gt(n)	선택한 요소 중에서 인덱스가 n보다 큰 요소를 모두 선택함.
			:lt(n)	선택한 요소 중에서 인덱스가 n보다 작은 요소를 모두 선택함.
			:even	선택한 요소 중에서 인덱스가 짝수인 요소를 모두 선택함.
			:odd	선택한 요소 중에서 인덱스가 홀수인 요소를 모두 선택함.
			:first	선택한 요소 중에서 첫 번째 요소를 선택함.
			:last	선택한 요소 중에서 마지막 요소를 선택함.
			:animated	선택한 요소 중에서 애니메이션 효과가 실행 중인 요소를 모두 선택함.
			:header	선택한 요소 중에서 h1부터 h6까지의 요소를 모두 선택함.
			:lang(언어)	선택한 요소 중에서 지정한 언어의 요소를 모두 선택함.
			:not(선택자)	선택한 요소 중에서 지정한 선택자와 일치하지 않는 요소를 모두 선택함.
			:root	선택한 요소 중에서 최상위 루트 요소를 선택함.
			:target	선택한 요소 중에서 웹 페이지 URI의 fragment 식별자와 일치하는 요소를 모두 선택함.
			:contains(텍스트)	선택한 요소 중에서 지정한 텍스트를 포함하는 요소를 모두 선택함.
			:has(선택자)	선택한 요소 중에서 지정한 선택자와 일치하는 자손 요소를 갖는 요소를 모두 선택함.
			:empty	선택한 요소 중에서 자식 요소를 가지고 있지 않은 요소를 모두 선택함.
			:parent	선택한 요소 중에서 자식 요소를 가지고 있는 요소를 모두 선택함.
		 * 
		 * 
		 * $(function() {

		    $("button").on("click", function() {
		
		        // 체크되어 있는 요소를 모두 선택함.
		
		        $(":checked").next().text("체크되어 있는 요소는 이 요소입니다.");
		
		    });
		
		});
		 * 
		 * :button	type 속성값이 "button"인 요소를 모두 선택함.
			:checkbox	type 속성값이 "checkbox"인 요소를 모두 선택함.
			:file	type 속성값이 "file"인 요소를 모두 선택함.
			:image	type 속성값이 "image"인 요소를 모두 선택함.
			:password	type 속성값이 "password"인 요소를 모두 선택함.
			:radio	type 속성값이 "radio"인 요소를 모두 선택함.
			:reset	type 속성값이 "reset"인 요소를 모두 선택함.
			:submit	type 속성값이 "submit"인 요소를 모두 선택함.
			:text	type 속성값이 "text"인 요소를 모두 선택함.
			:input	<input>, <textarea>, <select>, <button>요소를 모두 선택함.
			:checked	type 속성값이 "checkbox" 또는 "radio"인 요소 중에서 체크되어 있는 요소를 모두 선택함.
			:selected	<option>요소 중에서 선택된 요소를 모두 선택함.
			:focus	현재 포커스가 가지고 있는 요소를 선택함.
			:disabled	비활성화되어있는 요소를 모두 선택함.
			:enabled	활성화되어있는 요소를 모두 선택함.
					 * 
		 */
	}

}
