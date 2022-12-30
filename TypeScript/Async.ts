function step1(value, error) {
  return new Promise((resolve, reject) => {
    if (!error) {
      resolve(value + 10);
    } else {
      reject("error");
    }
  });
}

async function result() {
  let result1 = step1(10, false);
  console.log(result1);
}
result();