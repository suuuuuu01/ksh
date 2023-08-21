export default async function Read(props) {

    // console.log('props', props);
    //  /read/1, /read/2 주소 일부분을 파라미터 값으로 받고자 할 때 props 사용한다.


    const id = props.params.id;
    const resp = await fetch(`http://localhost:9999/topics/${id}`); // 백엔드 스프링 주소
    const topic = await resp.json();
    return (
    <>
        <h2>{topic.title}</h2>
        {topic.body}
    </>
    );
}