{mode, max}.

{duration, 5}.

{concurrent, 35}.

{driver, basho_bench_driver_riakc_pb}.

{key_generator, {int_to_bin, {uniform_int, 6000000}}}.

{value_generator, {fixed_bin, 700}}.

%% 5 node:
%{riakc_pb_ips, ["10.17.95.26","10.17.95.15","10.17.95.21","10.17.95.22","10.17.95.13"]}.
{riakc_pb_ips, ["10.0.1.2","10.0.1.37","10.0.1.38","10.0.1.40","10.0.1.9"]}.


{riakc_pb_replies, 1}.

%%{operations, [{put, 1}, {get, 1}, {update, 1}]}.
{operations, [{get, 1}]}.

%% Use {auto_reconnect, false} to get "old" behavior (prior to April 2013).
%% See deps/riakc/src/riakc_pb_socket.erl for all valid socket options.
{pb_connect_options, [{auto_reconnect, true}]}.

%% Overrides for the PB client's default 60 second timeout, on a
%% per-type-of-operation basis.  All timeout units are specified in
%% milliseconds.  The pb_timeout_general config item provides a
%% default timeout if the read/write/listkeys/mapreduce timeout is not
%% specified.

{pb_timeout_general, 30000}.
{pb_timeout_read, 5000}.
{pb_timeout_write, 5000}.
{pb_timeout_listkeys, 50000}.
%% The general timeout will be used because this specific item is commented:
%% {pb_timeout_mapreduce, 50000}.
