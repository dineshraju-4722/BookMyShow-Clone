import Navbar from "./Navbar";

export default function TheatesView() {
  return (
    <>
      <Navbar />
      <div className="w-[100vw]">
        {/* title card */}
        <section className=" px-[5vw] py-[1rem] border-b border-gray-400">
          <h1 className="text-3xl text-bold">Funky</h1>
          <section className="flex flex-wrap gap-4">
            <span className="px-[0.5rem] py-[0.2rem] border border-black rounded-xl text-[0.8rem] text-center">
              UA17
            </span>
            <span className="px-[0.5rem] py-[0.2rem] border border-black rounded-xl">
              {" "}
              Comedy
            </span>
            <span className="px-[0.5rem] py-[0.2rem] border border-black rounded-xl">
              {" "}
              3h19m
            </span>
          </section>
        </section>

        {/* showtimes */}
        <section className="px-[5vw] justify-between items-center flex py-[0.3rem] border-b border-gray-400">
          <section className="flex">
            <article className="h-[5rem] w-[3.5rem] bg-green-500 flex flex-col justify-center items-center gap-[0.5rem]  rounded-md">
              <span>SAT</span>
              <span className="font-bold">33</span>
              <span>FEB</span>
            </article>
            <article className="h-[5rem] w-[3.5rem] bg-green-500 flex flex-col justify-center items-center gap-[0.5rem]  rounded-md">
              <span>SAT</span>
              <span className="font-bold">33</span>
              <span>FEB</span>
            </article>
            <article className="h-[5rem] w-[3.5rem] bg-green-500 flex flex-col justify-center items-center gap-[0.5rem]  rounded-md">
              <span>SAT</span>
              <span className="font-bold">33</span>
              <span>FEB</span>
            </article>
          </section>
          <section>vhjk</section>
        </section>

        {/* Theatres */}
        <section className="px-[5vw] py-[1rem] flkex flex-col gap-[1rem] bg-gray-200 m-between-4">
            <article className="bg-white px-[1rem] py-[0.9rem] flex justify-center items-center gap-[1rem] border-b border-b-gray-400">
                <section className="flex flex-col w-[30vw] gap-[0.8rem]">
                    <article className="font-bold justify-between items-center flex">
                        <span>Theatre Name</span>
                        <span>like</span>
                    </article>
                    <span>Beverages</span>
                </section>
                <section className="flex flex-wrap w-[70vw] gap-x-[1rem] gap-y-[0.5rem]">
                    <span className="border border-green px-[1rem] py-[0.5rem] border-l-4 border-green-500">12.00PM</span>
                    <span className="border border-green px-[1rem] py-[0.5rem] border-l-4 border-green-500">12.00PM</span>
                    <span className="border border-green px-[1rem] py-[0.5rem] border-l-4 border-green-500">12.00PM</span>
                    <span className="border border-green px-[1rem] py-[0.5rem] border-l-4 border-green-500">12.00PM</span>
                    <span className="border border-green px-[1rem] py-[0.5rem] border-l-4 border-green-500">12.00PM</span>
                    <span className="border border-green px-[1rem] py-[0.5rem] border-l-4 border-green-500">12.00PM</span>
                    <span className="border border-green px-[1rem] py-[0.5rem] border-l-4 border-green-500">12.00PM</span>
                    <span className="border border-green px-[1rem] py-[0.5rem] border-l-4 border-green-500">12.00PM</span>
                    <span className="border border-green px-[1rem] py-[0.5rem] border-l-4 border-green-500">12.00PM</span>
                    <span className="border border-green px-[1rem] py-[0.5rem] border-l-4 border-green-500">12.00PM</span>
                    <span className="border border-green px-[1rem] py-[0.5rem] border-l-4 border-green-500">12.00PM</span>
                </section>

            </article>
            <article className="bg-white px-[1rem] py-[0.9rem] flex justify-center items-center gap-[1rem] border-b border-b-gray-400">
                <section className="flex flex-col w-[30vw] gap-[0.8rem]">
                    <article className="font-bold justify-between items-center flex">
                        <span>Theatre Name</span>
                        <span>like</span>
                    </article>
                    <span>Beverages</span>
                </section>
                <section className="flex flex-wrap w-[70vw] gap-x-[1rem] gap-y-[0.5rem]">
                    <span className="border border-green px-[1rem] py-[0.5rem] border-l-4 border-green-500">12.00PM</span>
                    <span className="border border-green px-[1rem] py-[0.5rem] border-l-4 border-green-500">12.00PM</span>
                    <span className="border border-green px-[1rem] py-[0.5rem] border-l-4 border-green-500">12.00PM</span>
                    <span className="border border-green px-[1rem] py-[0.5rem] border-l-4 border-green-500">12.00PM</span>
                    <span className="border border-green px-[1rem] py-[0.5rem] border-l-4 border-green-500">12.00PM</span>
                    <span className="border border-green px-[1rem] py-[0.5rem] border-l-4 border-green-500">12.00PM</span>
                    <span className="border border-green px-[1rem] py-[0.5rem] border-l-4 border-green-500">12.00PM</span>
                    <span className="border border-green px-[1rem] py-[0.5rem] border-l-4 border-green-500">12.00PM</span>
                    <span className="border border-green px-[1rem] py-[0.5rem] border-l-4 border-green-500">12.00PM</span>
                    <span className="border border-green px-[1rem] py-[0.5rem] border-l-4 border-green-500">12.00PM</span>
                    <span className="border border-green px-[1rem] py-[0.5rem] border-l-4 border-green-500">12.00PM</span>
                </section>

            </article>
            <article className="bg-white px-[1rem] py-[0.9rem] flex justify-center items-center gap-[1rem] border-b border-b-gray-400">
                <section className="flex flex-col w-[30vw] gap-[0.8rem]">
                    <article className="font-bold justify-between items-center flex">
                        <span>Theatre Name</span>
                        <span>like</span>
                    </article>
                    <span>Beverages</span>
                </section>
                <section className="flex flex-wrap w-[70vw] gap-x-[1rem] gap-y-[0.5rem]">
                    <span className="border border-green px-[1rem] py-[0.5rem] border-l-4 border-green-500">12.00PM</span>
                    <span className="border border-green px-[1rem] py-[0.5rem] border-l-4 border-green-500">12.00PM</span>
                    <span className="border border-green px-[1rem] py-[0.5rem] border-l-4 border-green-500">12.00PM</span>
                    <span className="border border-green px-[1rem] py-[0.5rem] border-l-4 border-green-500">12.00PM</span>
                    <span className="border border-green px-[1rem] py-[0.5rem] border-l-4 border-green-500">12.00PM</span>
                    <span className="border border-green px-[1rem] py-[0.5rem] border-l-4 border-green-500">12.00PM</span>
                    <span className="border border-green px-[1rem] py-[0.5rem] border-l-4 border-green-500">12.00PM</span>
                    <span className="border border-green px-[1rem] py-[0.5rem] border-l-4 border-green-500">12.00PM</span>
                    <span className="border border-green px-[1rem] py-[0.5rem] border-l-4 border-green-500">12.00PM</span>
                    <span className="border border-green px-[1rem] py-[0.5rem] border-l-4 border-green-500">12.00PM</span>
                    <span className="border border-green px-[1rem] py-[0.5rem] border-l-4 border-green-500">12.00PM</span>
                </section>

            </article>
            <article className="bg-white px-[1rem] py-[0.9rem] flex justify-center items-center gap-[1rem] border-b border-b-gray-400">
                <section className="flex flex-col w-[30vw] gap-[0.8rem]">
                    <article className="font-bold justify-between items-center flex">
                        <span>Theatre Name</span>
                        <span>like</span>
                    </article>
                    <span>Beverages</span>
                </section>
                <section className="flex flex-wrap w-[70vw] gap-x-[1rem] gap-y-[0.5rem]">
                    <span className="border border-green px-[1rem] py-[0.5rem] border-l-4 border-green-500">12.00PM</span>
                    <span className="border border-green px-[1rem] py-[0.5rem] border-l-4 border-green-500">12.00PM</span>
                    <span className="border border-green px-[1rem] py-[0.5rem] border-l-4 border-green-500">12.00PM</span>
                    <span className="border border-green px-[1rem] py-[0.5rem] border-l-4 border-green-500">12.00PM</span>
                    <span className="border border-green px-[1rem] py-[0.5rem] border-l-4 border-green-500">12.00PM</span>
                    <span className="border border-green px-[1rem] py-[0.5rem] border-l-4 border-green-500">12.00PM</span>
                    <span className="border border-green px-[1rem] py-[0.5rem] border-l-4 border-green-500">12.00PM</span>
                    <span className="border border-green px-[1rem] py-[0.5rem] border-l-4 border-green-500">12.00PM</span>
                    <span className="border border-green px-[1rem] py-[0.5rem] border-l-4 border-green-500">12.00PM</span>
                    <span className="border border-green px-[1rem] py-[0.5rem] border-l-4 border-green-500">12.00PM</span>
                    <span className="border border-green px-[1rem] py-[0.5rem] border-l-4 border-green-500">12.00PM</span>
                </section>

            </article>
         

            
            
        </section>
      </div>
    </>
  );
}
