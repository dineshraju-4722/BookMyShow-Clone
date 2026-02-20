import { Button } from "antd";

export default function TitleCard() {
  return (
    <div className="w-full h-[30rem] bg-gray-500 flex items-center justify-center gap-[2vw]">
      <img
        src="#"
        alt="Image"
        className="h-[25rem] w-[15rem] bg-black rounded-md"
      />
      <section className="w-[65vw] bg-red-500">
        <h1 className="text-3xl font-bold">Avatar: Fire and Ash</h1>
        <section className="h-[4rem] w-[27rem] bg-green-500 items-center justify-between flex p-[2rem]">
          <section className="flex gap-[0.5rem]">
            <i class="fa-solid fa-star"></i>
            <span> 8.3/10</span>
            <span>( 156 votes) </span>
          </section>
          <Button>Rate Now</Button>
        </section>
        <section className="flex flex-wrap gap-x-[2.5rem] gap-y-[0.5rem] ml-[2rem] mt-[2rem]">
          <li>3h17m</li>
          <li>UAV16</li>
          <li>19 DEC , 2025</li>
          <li>
            <span>abb, </span>

            <span>abb ,</span>
            <span>abb,</span>
          </li>
        </section>
        <section className="flex flex-wrap text-sm gap-x-[1rem] mb-[1rem]">
            <section className="flex flex-wrap bg-yellow-500  items-center py-[0.5rem] px-[0.5rem] mt-[1rem]">
            <span className="font-bold">Director: </span>
            <span className="font-bold">Director: </span>
            <span className="font-bold">, </span>
            <span className="font-bold">Director: </span>
            </section>
            <section className="flex flex-wrap bg-yellow-500  items-center py-[0.5rem] px-[0.5rem] mt-[1rem]">
            <span className="font-bold">Director: </span>
            <span className="font-bold">, </span>
            </section>
        </section>
        <Button className="bg-blue-500 w-[10rem] p-[3rem]" type="primary" >Book Now</Button>
      </section>
    </div>
  );
}
