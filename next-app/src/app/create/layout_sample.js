export default function Layout(props) {

    // 이 파일을 동작시키려면, 파일명을 layout.js로 변경.
    return (
        <form>
        <h2>Create</h2>
        {props.children}
        </form>
    );
}