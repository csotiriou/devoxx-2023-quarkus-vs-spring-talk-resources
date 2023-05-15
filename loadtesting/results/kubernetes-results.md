# Results document

# Note:
the architecture of the prebuilt images provided here is "arm64", make sure to create new images for X64!

## Quarkus results
### Quarkus first run: 

```
➜  devoxx-may-2023-code git:(main) k6 run --vus 10 --duration 30s ./loadtesting/k6-quarkus.js

          /\      |‾‾| /‾‾/   /‾‾/   
     /\  /  \     |  |/  /   /  /    
    /  \/    \    |     (   /   ‾‾\  
   /          \   |  |\  \ |  (‾)  | 
  / __________ \  |__| \__\ \_____/ .io

  execution: local
     script: ./loadtesting/k6-quarkus.js
     output: -

  scenarios: (100.00%) 1 scenario, 10 max VUs, 1m0s max duration (incl. graceful stop):
           * default: 10 looping VUs for 30s (gracefulStop: 30s)


     data_received..................: 20 MB  654 kB/s
     data_sent......................: 15 MB  501 kB/s
     http_req_blocked...............: avg=1.2µs   min=0s       med=1µs    max=7.36ms   p(90)=1µs    p(95)=2µs   
     http_req_connecting............: avg=28ns    min=0s       med=0s     max=496µs    p(90)=0s     p(95)=0s    
     http_req_duration..............: avg=1.86ms  min=377µs    med=1.16ms max=789.84ms p(90)=2ms    p(95)=2.87ms
       { expected_response:true }...: avg=1.86ms  min=377µs    med=1.16ms max=789.84ms p(90)=2ms    p(95)=2.87ms
     http_req_failed................: 0.00%  ✓ 0           ✗ 158224
     http_req_receiving.............: avg=15.07µs min=3µs      med=9µs    max=16.94ms  p(90)=18µs   p(95)=29µs  
     http_req_sending...............: avg=4.93µs  min=1µs      med=3µs    max=10.75ms  p(90)=6µs    p(95)=8µs   
     http_req_tls_handshaking.......: avg=0s      min=0s       med=0s     max=0s       p(90)=0s     p(95)=0s    
     http_req_waiting...............: avg=1.84ms  min=367µs    med=1.14ms max=789.33ms p(90)=1.97ms p(95)=2.82ms
     http_reqs......................: 158224 5273.612828/s
     iteration_duration.............: avg=1.89ms  min=388.58µs med=1.18ms max=792.84ms p(90)=2.04ms p(95)=2.93ms
     iterations.....................: 158224 5273.612828/s
     vus............................: 10     min=10        max=10  
     vus_max........................: 10     min=10        max=10  


running (0m30.0s), 00/10 VUs, 158224 complete and 0 interrupted iterations
default ✓ [======================================] 10 VUs  30s
```

### Quarkus second run: 

```
➜  devoxx-may-2023-code git:(main) k6 run --vus 10 --duration 30s ./loadtesting/k6-quarkus.js

          /\      |‾‾| /‾‾/   /‾‾/   
     /\  /  \     |  |/  /   /  /    
    /  \/    \    |     (   /   ‾‾\  
   /          \   |  |\  \ |  (‾)  | 
  / __________ \  |__| \__\ \_____/ .io

  execution: local
     script: ./loadtesting/k6-quarkus.js
     output: -

  scenarios: (100.00%) 1 scenario, 10 max VUs, 1m0s max duration (incl. graceful stop):
           * default: 10 looping VUs for 30s (gracefulStop: 30s)


     data_received..................: 26 MB  865 kB/s
     data_sent......................: 20 MB  663 kB/s
     http_req_blocked...............: avg=659ns  min=0s       med=1µs    max=1.82ms   p(90)=1µs    p(95)=1µs   
     http_req_connecting............: avg=22ns   min=0s       med=0s     max=508µs    p(90)=0s     p(95)=0s    
     http_req_duration..............: avg=1.41ms min=442µs    med=1.12ms max=110.6ms  p(90)=1.79ms p(95)=2.24ms
       { expected_response:true }...: avg=1.41ms min=442µs    med=1.12ms max=110.6ms  p(90)=1.79ms p(95)=2.24ms
     http_req_failed................: 0.00%  ✓ 0           ✗ 209299
     http_req_receiving.............: avg=8.93µs min=3µs      med=8µs    max=3.24ms   p(90)=11µs   p(95)=13µs  
     http_req_sending...............: avg=2.76µs min=1µs      med=2µs    max=1.37ms   p(90)=3µs    p(95)=4µs   
     http_req_tls_handshaking.......: avg=0s     min=0s       med=0s     max=0s       p(90)=0s     p(95)=0s    
     http_req_waiting...............: avg=1.4ms  min=429µs    med=1.11ms max=110.59ms p(90)=1.77ms p(95)=2.23ms
     http_reqs......................: 209299 6976.468921/s
     iteration_duration.............: avg=1.43ms min=452.12µs med=1.14ms max=110.61ms p(90)=1.8ms  p(95)=2.25ms
     iterations.....................: 209299 6976.468921/s
     vus............................: 10     min=10        max=10  
     vus_max........................: 10     min=10        max=10  


running (0m30.0s), 00/10 VUs, 209299 complete and 0 interrupted iterations
default ✓ [======================================] 10 VUs  30s
```

# Spring results

## Spring first run

```
➜  devoxx-may-2023-code git:(main) k6 run --vus 10 --duration 30s ./loadtesting/k6-spring.js 

          /\      |‾‾| /‾‾/   /‾‾/   
     /\  /  \     |  |/  /   /  /    
    /  \/    \    |     (   /   ‾‾\  
   /          \   |  |\  \ |  (‾)  | 
  / __________ \  |__| \__\ \_____/ .io

  execution: local
     script: ./loadtesting/k6-spring.js
     output: -

  scenarios: (100.00%) 1 scenario, 10 max VUs, 1m0s max duration (incl. graceful stop):
           * default: 10 looping VUs for 30s (gracefulStop: 30s)


     data_received..................: 4.1 MB 137 kB/s
     data_sent......................: 3.5 MB 118 kB/s
     http_req_blocked...............: avg=2.41µs  min=0s       med=1µs    max=3.79ms   p(90)=2µs    p(95)=3µs    
     http_req_connecting............: avg=133ns   min=0s       med=0s     max=581µs    p(90)=0s     p(95)=0s     
     http_req_duration..............: avg=7.97ms  min=480µs    med=1.62ms max=695.44ms p(90)=7.53ms p(95)=77.02ms
       { expected_response:true }...: avg=7.97ms  min=480µs    med=1.62ms max=695.44ms p(90)=7.53ms p(95)=77.02ms
     http_req_failed................: 0.00%  ✓ 0           ✗ 37334
     http_req_receiving.............: avg=27.96µs min=3µs      med=11µs   max=11.87ms  p(90)=35µs   p(95)=58µs   
     http_req_sending...............: avg=10.36µs min=1µs      med=3µs    max=16.61ms  p(90)=9µs    p(95)=14µs   
     http_req_tls_handshaking.......: avg=0s      min=0s       med=0s     max=0s       p(90)=0s     p(95)=0s     
     http_req_waiting...............: avg=7.93ms  min=470µs    med=1.59ms max=695.42ms p(90)=7.44ms p(95)=76.87ms
     http_reqs......................: 37334  1244.416973/s
     iteration_duration.............: avg=8.02ms  min=491.12µs med=1.66ms max=697.03ms p(90)=7.67ms p(95)=77.09ms
     iterations.....................: 37334  1244.416973/s
     vus............................: 10     min=10        max=10 
     vus_max........................: 10     min=10        max=10 
```

### Spring second run

```
➜  devoxx-may-2023-code git:(main) k6 run --vus 10 --duration 30s ./loadtesting/k6-spring.js 

          /\      |‾‾| /‾‾/   /‾‾/   
     /\  /  \     |  |/  /   /  /    
    /  \/    \    |     (   /   ‾‾\  
   /          \   |  |\  \ |  (‾)  | 
  / __________ \  |__| \__\ \_____/ .io

  execution: local
     script: ./loadtesting/k6-spring.js
     output: -

  scenarios: (100.00%) 1 scenario, 10 max VUs, 1m0s max duration (incl. graceful stop):
           * default: 10 looping VUs for 30s (gracefulStop: 30s)


     data_received..................: 13 MB  417 kB/s
     data_sent......................: 11 MB  360 kB/s
     http_req_blocked...............: avg=709ns  min=0s    med=1µs    max=1.74ms  p(90)=1µs    p(95)=1µs   
     http_req_connecting............: avg=41ns   min=0s    med=0s     max=520µs   p(90)=0s     p(95)=0s    
     http_req_duration..............: avg=2.62ms min=411µs med=1.53ms max=97.52ms p(90)=3.03ms p(95)=4.49ms
       { expected_response:true }...: avg=2.62ms min=411µs med=1.53ms max=97.52ms p(90)=3.03ms p(95)=4.49ms
     http_req_failed................: 0.00%  ✓ 0           ✗ 113723
     http_req_receiving.............: avg=8.68µs min=3µs   med=8µs    max=1.22ms  p(90)=11µs   p(95)=13µs  
     http_req_sending...............: avg=2.65µs min=1µs   med=2µs    max=268µs   p(90)=3µs    p(95)=4µs   
     http_req_tls_handshaking.......: avg=0s     min=0s    med=0s     max=0s      p(90)=0s     p(95)=0s    
     http_req_waiting...............: avg=2.61ms min=401µs med=1.52ms max=97.51ms p(90)=3.02ms p(95)=4.48ms
     http_reqs......................: 113723 3790.606829/s
     iteration_duration.............: avg=2.63ms min=424µs med=1.54ms max=97.54ms p(90)=3.05ms p(95)=4.5ms 
     iterations.....................: 113723 3790.606829/s
     vus............................: 10     min=10        max=10  
     vus_max........................: 10     min=10        max=10  


running (0m30.0s), 00/10 VUs, 113723 complete and 0 interrupted iterations
default ✓ [======================================] 10 VUs  30s

```

# Results with 1GB RAM and 1CPU

## Spring boot cold
```
➜  devoxx-may-2023-code git:(main) ✗ k6 run --vus 10 --duration 30s ./loadtesting/k6-spring.js

          /\      |‾‾| /‾‾/   /‾‾/   
     /\  /  \     |  |/  /   /  /    
    /  \/    \    |     (   /   ‾‾\  
   /          \   |  |\  \ |  (‾)  | 
  / __________ \  |__| \__\ \_____/ .io

  execution: local
     script: ./loadtesting/k6-spring.js
     output: -

  scenarios: (100.00%) 1 scenario, 10 max VUs, 1m0s max duration (incl. graceful stop):
           * default: 10 looping VUs for 30s (gracefulStop: 30s)


     data_received..................: 16 MB  526 kB/s
     data_sent......................: 14 MB  454 kB/s
     http_req_blocked...............: avg=973ns   min=0s       med=1µs    max=5.68ms   p(90)=1µs    p(95)=2µs   
     http_req_connecting............: avg=31ns    min=0s       med=0s     max=525µs    p(90)=0s     p(95)=0s    
     http_req_duration..............: avg=2.06ms  min=457µs    med=1.53ms max=326.55ms p(90)=2.69ms p(95)=3.79ms
       { expected_response:true }...: avg=2.06ms  min=457µs    med=1.53ms max=326.55ms p(90)=2.69ms p(95)=3.79ms
     http_req_failed................: 0.00%  ✓ 0           ✗ 143333
     http_req_receiving.............: avg=12.76µs min=3µs      med=9µs    max=5.56ms   p(90)=17µs   p(95)=24µs  
     http_req_sending...............: avg=4.25µs  min=1µs      med=3µs    max=7.5ms    p(90)=6µs    p(95)=7µs   
     http_req_tls_handshaking.......: avg=0s      min=0s       med=0s     max=0s       p(90)=0s     p(95)=0s    
     http_req_waiting...............: avg=2.05ms  min=445µs    med=1.52ms max=326.49ms p(90)=2.66ms p(95)=3.75ms
     http_reqs......................: 143333 4777.720164/s
     iteration_duration.............: avg=2.08ms  min=469.62µs med=1.55ms max=328ms    p(90)=2.72ms p(95)=3.83ms
     iterations.....................: 143333 4777.720164/s
     vus............................: 10     min=10        max=10  
     vus_max........................: 10     min=10        max=10  


running (0m30.0s), 00/10 VUs, 143333 complete and 0 interrupted iterations
```

## Spring boot warm

```
➜  devoxx-may-2023-code git:(main) ✗ k6 run --vus 10 --duration 30s ./loadtesting/k6-spring.js

          /\      |‾‾| /‾‾/   /‾‾/   
     /\  /  \     |  |/  /   /  /    
    /  \/    \    |     (   /   ‾‾\  
   /          \   |  |\  \ |  (‾)  | 
  / __________ \  |__| \__\ \_____/ .io

  execution: local
     script: ./loadtesting/k6-spring.js
     output: -

  scenarios: (100.00%) 1 scenario, 10 max VUs, 1m0s max duration (incl. graceful stop):
           * default: 10 looping VUs for 30s (gracefulStop: 30s)


     data_received..................: 19 MB  626 kB/s
     data_sent......................: 16 MB  541 kB/s
     http_req_blocked...............: avg=980ns   min=0s       med=1µs    max=4.46ms  p(90)=1µs    p(95)=2µs   
     http_req_connecting............: avg=23ns    min=0s       med=0s     max=423µs   p(90)=0s     p(95)=0s    
     http_req_duration..............: avg=1.73ms  min=457µs    med=1.49ms max=54.78ms p(90)=2.41ms p(95)=3.18ms
       { expected_response:true }...: avg=1.73ms  min=457µs    med=1.49ms max=54.78ms p(90)=2.41ms p(95)=3.18ms
     http_req_failed................: 0.00%  ✓ 0           ✗ 170704
     http_req_receiving.............: avg=12.56µs min=3µs      med=9µs    max=8.61ms  p(90)=16µs   p(95)=23µs  
     http_req_sending...............: avg=3.98µs  min=1µs      med=3µs    max=4.13ms  p(90)=5µs    p(95)=7µs   
     http_req_tls_handshaking.......: avg=0s      min=0s       med=0s     max=0s      p(90)=0s     p(95)=0s    
     http_req_waiting...............: avg=1.71ms  min=446µs    med=1.48ms max=54.76ms p(90)=2.39ms p(95)=3.15ms
     http_reqs......................: 170704 5690.091227/s
     iteration_duration.............: avg=1.75ms  min=468.91µs med=1.51ms max=55ms    p(90)=2.44ms p(95)=3.22ms
     iterations.....................: 170704 5690.091227/s
     vus............................: 10     min=10        max=10  
     vus_max........................: 10     min=10        max=10  


running (0m30.0s), 00/10 VUs, 170704 complete and 0 interrupted iterations
default ✓ [======================================] 10 VUs  30s
```


## Quarkus cold

```
devoxx-may-2023-code git:(main) ✗ k6 run --vus 10 --duration 30s ./loadtesting/k6-quarkus.js

          /\      |‾‾| /‾‾/   /‾‾/
     /\  /  \     |  |/  /   /  /
    /  \/    \    |     (   /   ‾‾\
   /          \   |  |\  \ |  (‾)  |
  / __________ \  |__| \__\ \_____/ .io

  execution: local
     script: ./loadtesting/k6-quarkus.js
     output: -

  scenarios: (100.00%) 1 scenario, 10 max VUs, 1m0s max duration (incl. graceful stop):
           * default: 10 looping VUs for 30s (gracefulStop: 30s)


     data_received..................: 24 MB  791 kB/s
     data_sent......................: 18 MB  606 kB/s
     http_req_blocked...............: avg=768ns   min=0s       med=1µs    max=3.1ms    p(90)=1µs    p(95)=1µs
     http_req_connecting............: avg=25ns    min=0s       med=0s     max=594µs    p(90)=0s     p(95)=0s
     http_req_duration..............: avg=1.54ms  min=435µs    med=1.34ms max=191.34ms p(90)=1.99ms p(95)=2.39ms
       { expected_response:true }...: avg=1.54ms  min=435µs    med=1.34ms max=191.34ms p(90)=1.99ms p(95)=2.39ms
     http_req_failed................: 0.00%  ✓ 0           ✗ 191427
     http_req_receiving.............: avg=10.86µs min=3µs      med=9µs    max=7.69ms   p(90)=14µs   p(95)=19µs
     http_req_sending...............: avg=3.49µs  min=1µs      med=2µs    max=12.08ms  p(90)=5µs    p(95)=6µs
     http_req_tls_handshaking.......: avg=0s      min=0s       med=0s     max=0s       p(90)=0s     p(95)=0s
     http_req_waiting...............: avg=1.53ms  min=418µs    med=1.32ms max=191.14ms p(90)=1.97ms p(95)=2.37ms
     http_reqs......................: 191427 6380.923397/s
     iteration_duration.............: avg=1.56ms  min=444.54µs med=1.35ms max=193.5ms  p(90)=2.01ms p(95)=2.42ms
     iterations.....................: 191427 6380.923397/s
     vus............................: 10     min=10        max=10
     vus_max........................: 10     min=10        max=10


running (0m30.0s), 00/10 VUs, 191427 complete and 0 interrupted iterations
default ✓ [======================================] 10 VUs  30s
```

## Quarkus hot

```
➜  devoxx-may-2023-code git:(main) ✗ k6 run --vus 10 --duration 30s ./loadtesting/k6-quarkus.js

          /\      |‾‾| /‾‾/   /‾‾/
     /\  /  \     |  |/  /   /  /
    /  \/    \    |     (   /   ‾‾\
   /          \   |  |\  \ |  (‾)  |
  / __________ \  |__| \__\ \_____/ .io

  execution: local
     script: ./loadtesting/k6-quarkus.js
     output: -

  scenarios: (100.00%) 1 scenario, 10 max VUs, 1m0s max duration (incl. graceful stop):
           * default: 10 looping VUs for 30s (gracefulStop: 30s)


     data_received..................: 27 MB  887 kB/s
     data_sent......................: 20 MB  680 kB/s
     http_req_blocked...............: avg=612ns  min=0s       med=1µs    max=1.21ms  p(90)=1µs    p(95)=1µs
     http_req_connecting............: avg=21ns   min=0s       med=0s     max=523µs   p(90)=0s     p(95)=0s
     http_req_duration..............: avg=1.38ms min=419µs    med=1.29ms max=48.9ms  p(90)=1.81ms p(95)=2.02ms
       { expected_response:true }...: avg=1.38ms min=419µs    med=1.29ms max=48.9ms  p(90)=1.81ms p(95)=2.02ms
     http_req_failed................: 0.00%  ✓ 0           ✗ 214573
     http_req_receiving.............: avg=9.04µs min=3µs      med=8µs    max=611µs   p(90)=12µs   p(95)=14µs
     http_req_sending...............: avg=2.67µs min=1µs      med=2µs    max=391µs   p(90)=3µs    p(95)=4µs
     http_req_tls_handshaking.......: avg=0s     min=0s       med=0s     max=0s      p(90)=0s     p(95)=0s
     http_req_waiting...............: avg=1.37ms min=409µs    med=1.28ms max=48.87ms p(90)=1.8ms  p(95)=2.01ms
     http_reqs......................: 214573 7152.408777/s
     iteration_duration.............: avg=1.39ms min=430.91µs med=1.3ms  max=48.92ms p(90)=1.82ms p(95)=2.04ms
     iterations.....................: 214573 7152.408777/s
     vus............................: 10     min=10        max=10
     vus_max........................: 10     min=10        max=10


running (0m30.0s), 00/10 VUs, 214573 complete and 0 interrupted iterations
default ✓ [======================================] 10 VUs  30s
```


## Pressing Spring and Quarkus
Ran warmed up microservices, and doubled the amount of VUs to 20. The results are very close this time

```
➜  devoxx-may-2023-code git:(main) ✗ k6 run --vus 20 --duration 30s ./loadtesting/k6-quarkus.js

          /\      |‾‾| /‾‾/   /‾‾/
     /\  /  \     |  |/  /   /  /
    /  \/    \    |     (   /   ‾‾\
   /          \   |  |\  \ |  (‾)  |
  / __________ \  |__| \__\ \_____/ .io

  execution: local
     script: ./loadtesting/k6-quarkus.js
     output: -

  scenarios: (100.00%) 1 scenario, 20 max VUs, 1m0s max duration (incl. graceful stop):
           * default: 20 looping VUs for 30s (gracefulStop: 30s)


     data_received..................: 38 MB  1.3 MB/s
     data_sent......................: 29 MB  973 kB/s
     http_req_blocked...............: avg=630ns  min=0s       med=1µs    max=1.54ms  p(90)=1µs    p(95)=1µs
     http_req_connecting............: avg=41ns   min=0s       med=0s     max=713µs   p(90)=0s     p(95)=0s
     http_req_duration..............: avg=1.93ms min=531µs    med=1.85ms max=27.62ms p(90)=2.54ms p(95)=2.82ms
       { expected_response:true }...: avg=1.93ms min=531µs    med=1.85ms max=27.62ms p(90)=2.54ms p(95)=2.82ms
     http_req_failed................: 0.00%  ✓ 0            ✗ 307385
     http_req_receiving.............: avg=9µs    min=3µs      med=8µs    max=796µs   p(90)=12µs   p(95)=13µs
     http_req_sending...............: avg=2.72µs min=1µs      med=2µs    max=720µs   p(90)=3µs    p(95)=4µs
     http_req_tls_handshaking.......: avg=0s     min=0s       med=0s     max=0s      p(90)=0s     p(95)=0s
     http_req_waiting...............: avg=1.92ms min=524µs    med=1.84ms max=27.61ms p(90)=2.53ms p(95)=2.8ms
     http_reqs......................: 307385 10246.126024/s
     iteration_duration.............: avg=1.94ms min=544.16µs med=1.86ms max=27.64ms p(90)=2.55ms p(95)=2.83ms
     iterations.....................: 307385 10246.126024/s
     vus............................: 20     min=20         max=20
     vus_max........................: 20     min=20         max=20


running (0m30.0s), 00/20 VUs, 307385 complete and 0 interrupted iterations
default ✓ [======================================] 20 VUs  30s
```

```
➜  devoxx-may-2023-code git:(main) ✗ k6 run --vus 20 --duration 30s ./loadtesting/k6-spring.js

          /\      |‾‾| /‾‾/   /‾‾/
     /\  /  \     |  |/  /   /  /
    /  \/    \    |     (   /   ‾‾\
   /          \   |  |\  \ |  (‾)  |
  / __________ \  |__| \__\ \_____/ .io

  execution: local
     script: ./loadtesting/k6-spring.js
     output: -

  scenarios: (100.00%) 1 scenario, 20 max VUs, 1m0s max duration (incl. graceful stop):
           * default: 20 looping VUs for 30s (gracefulStop: 30s)


     data_received..................: 32 MB  1.1 MB/s
     data_sent......................: 28 MB  918 kB/s
     http_req_blocked...............: avg=650ns  min=0s       med=1µs    max=1.24ms  p(90)=1µs    p(95)=1µs
     http_req_connecting............: avg=40ns   min=0s       med=0s     max=738µs   p(90)=0s     p(95)=0s
     http_req_duration..............: avg=2.05ms min=538µs    med=1.95ms max=28.84ms p(90)=2.74ms p(95)=3.06ms
       { expected_response:true }...: avg=2.05ms min=538µs    med=1.95ms max=28.84ms p(90)=2.74ms p(95)=3.06ms
     http_req_failed................: 0.00%  ✓ 0           ✗ 289980
     http_req_receiving.............: avg=9.14µs min=3µs      med=8µs    max=922µs   p(90)=12µs   p(95)=14µs
     http_req_sending...............: avg=2.8µs  min=1µs      med=2µs    max=594µs   p(90)=4µs    p(95)=4µs
     http_req_tls_handshaking.......: avg=0s     min=0s       med=0s     max=0s      p(90)=0s     p(95)=0s
     http_req_waiting...............: avg=2.03ms min=527µs    med=1.93ms max=28.83ms p(90)=2.73ms p(95)=3.05ms
     http_reqs......................: 289980 9665.827948/s
     iteration_duration.............: avg=2.06ms min=550.58µs med=1.96ms max=28.86ms p(90)=2.75ms p(95)=3.07ms
     iterations.....................: 289980 9665.827948/s
     vus............................: 20     min=20        max=20
     vus_max........................: 20     min=20        max=20


running (0m30.0s), 00/20 VUs, 289980 complete and 0 interrupted iterations
default ✓ [======================================] 20 VUs  30s
➜  devoxx-may-2023-code git:(main) ✗
```


------------------

## Spring boot with much memory

```
➜  devoxx-may-2023-code git:(main) ✗ k6 run --vus 30 --duration 60s ./loadtesting/k6-spring.js

          /\      |‾‾| /‾‾/   /‾‾/
     /\  /  \     |  |/  /   /  /
    /  \/    \    |     (   /   ‾‾\
   /          \   |  |\  \ |  (‾)  |
  / __________ \  |__| \__\ \_____/ .io

  execution: local
     script: ./loadtesting/k6-spring.js
     output: -

  scenarios: (100.00%) 1 scenario, 30 max VUs, 1m30s max duration (incl. graceful stop):
           * default: 30 looping VUs for 1m0s (gracefulStop: 30s)


     data_received..................: 43 MB  714 kB/s
     data_sent......................: 37 MB  617 kB/s
     http_req_blocked...............: avg=791ns   min=0s       med=1µs    max=1.85ms  p(90)=1µs    p(95)=1µs
     http_req_connecting............: avg=74ns    min=0s       med=0s     max=1.17ms  p(90)=0s     p(95)=0s
     http_req_duration..............: avg=4.59ms  min=710µs    med=3.98ms max=87.85ms p(90)=6.71ms p(95)=8.39ms
       { expected_response:true }...: avg=4.59ms  min=710µs    med=3.98ms max=87.85ms p(90)=6.71ms p(95)=8.39ms
     http_req_failed................: 0.00%  ✓ 0           ✗ 389529
     http_req_receiving.............: avg=11.14µs min=3µs      med=8µs    max=7.21ms  p(90)=16µs   p(95)=22µs
     http_req_sending...............: avg=3.54µs  min=1µs      med=3µs    max=5.77ms  p(90)=5µs    p(95)=6µs
     http_req_tls_handshaking.......: avg=0s      min=0s       med=0s     max=0s      p(90)=0s     p(95)=0s
     http_req_waiting...............: avg=4.58ms  min=698µs    med=3.97ms max=87.84ms p(90)=6.69ms p(95)=8.36ms
     http_reqs......................: 389529 6491.760278/s
     iteration_duration.............: avg=4.61ms  min=722.58µs med=4ms    max=87.87ms p(90)=6.73ms p(95)=8.41ms
     iterations.....................: 389529 6491.760278/s
     vus............................: 30     min=30        max=30
     vus_max........................: 30     min=30        max=30


running (1m00.0s), 00/30 VUs, 389529 complete and 0 interrupted iterations
default ✓ [======================================] 30 VUs  1m0s
```

Quarkus with much memory

```
➜  devoxx-may-2023-code git:(main) ✗ k6 run --vus 30 --duration 60s ./loadtesting/k6-quarkus.js

          /\      |‾‾| /‾‾/   /‾‾/
     /\  /  \     |  |/  /   /  /
    /  \/    \    |     (   /   ‾‾\
   /          \   |  |\  \ |  (‾)  |
  / __________ \  |__| \__\ \_____/ .io

  execution: local
     script: ./loadtesting/k6-quarkus.js
     output: -

  scenarios: (100.00%) 1 scenario, 30 max VUs, 1m30s max duration (incl. graceful stop):
           * default: 30 looping VUs for 1m0s (gracefulStop: 30s)

WARN[0000] Error from API server                         error="listen tcp 127.0.0.1:6565: bind: address already in use"

     data_received..................: 54 MB  901 kB/s
     data_sent......................: 41 MB  690 kB/s
     http_req_blocked...............: avg=766ns   min=0s      med=1µs    max=3.13ms  p(90)=1µs    p(95)=1µs
     http_req_connecting............: avg=63ns    min=0s      med=0s     max=1.11ms  p(90)=0s     p(95)=0s
     http_req_duration..............: avg=4.1ms   min=703µs   med=3.72ms max=58.22ms p(90)=6.16ms p(95)=7.24ms
       { expected_response:true }...: avg=4.1ms   min=703µs   med=3.72ms max=58.22ms p(90)=6.16ms p(95)=7.24ms
     http_req_failed................: 0.00%  ✓ 0           ✗ 436062
     http_req_receiving.............: avg=11.03µs min=3µs     med=8µs    max=14.98ms p(90)=15µs   p(95)=21µs
     http_req_sending...............: avg=3.39µs  min=1µs     med=3µs    max=6.37ms  p(90)=4µs    p(95)=6µs
     http_req_tls_handshaking.......: avg=0s      min=0s      med=0s     max=0s      p(90)=0s     p(95)=0s
     http_req_waiting...............: avg=4.09ms  min=674µs   med=3.71ms max=58.2ms  p(90)=6.14ms p(95)=7.23ms
     http_reqs......................: 436062 7267.515526/s
     iteration_duration.............: avg=4.12ms  min=716.7µs med=3.74ms max=58.23ms p(90)=6.18ms p(95)=7.27ms
     iterations.....................: 436062 7267.515526/s
     vus............................: 30     min=30        max=30
     vus_max........................: 30     min=30        max=30


running (1m00.0s), 00/30 VUs, 436062 complete and 0 interrupted iterations
default ✓ [======================================] 30 VUs  1m0s
```


# Conclusions
- Inside microk8s, I get consistent results, whereas in Docker desktop, I was not getting consistent results, especially when it iad to do with the boot time. 
- Both frameworks behaved very poorly in Docker Desktop, even when giving them the same amount of RAM and CPU

Why the differences?

I believe that Docker is at fault, expecially in the Networking code. In many instances, I saw the error that is thrown here: https://github.com/quarkusio/quarkus/blob/main/extensions/netty/runtime/src/main/java/io/quarkus/netty/runtime/NettyRecorder.java about the `DefauleChanngelId.newInstance()`, and then the application took too long to boot, like 14 seconds. In the restart cases where this error didn't happen, I had 5 seconds boot time. Same applies with Spring Boot. There are cases where I had 40 seconds boot time, and other ones I had 15 seconds!

In microk8s, both frameworks exhibited consistent behaviour, and the boot time was always around 3 seconds for Quarkus and 7-8 seconds for Spring Boot. with the same amount of RAM and CPU.
