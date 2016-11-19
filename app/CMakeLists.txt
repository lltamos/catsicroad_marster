
#cmake_minimum_required(VERSION 3.4.1)





#Add other prebuilt libraries
#add_library(avcodec-lib  SHARED IMPORTED )
 #set_target_properties(avcodec-lib PROPERTIES IMPORTED_LOCATION
 #                      ${CMAKE_CURRENT_SOURCE_DIR}/src/main/jniLibs/armeabi/libavcodec-57.so )
# add_library(avdevice-lib  SHARED IMPORTED )
#set_target_properties(avdevice-lib PROPERTIES IMPORTED_LOCATION
#                       ${CMAKE_CURRENT_SOURCE_DIR}/src/main/jniLibs/armeabi/libavdevice-57.so )
 #add_library(avfilter-lib  SHARED IMPORTED )
 #set_target_properties(avfilter-lib PROPERTIES IMPORTED_LOCATION
 #                      ${CMAKE_CURRENT_SOURCE_DIR}/src/main/jniLibs/armeabi/libavfilter-6.so )
 #add_library(avformat-lib  SHARED IMPORTED )
 #set_target_properties(avformat-lib PROPERTIES IMPORTED_LOCATION
 #                      ${CMAKE_CURRENT_SOURCE_DIR}/src/main/jniLibs/armeabi/libavformat-57.so )
 #add_library(avutil-lib  SHARED IMPORTED )
 #set_target_properties(avutil-lib PROPERTIES IMPORTED_LOCATION
 #                      ${CMAKE_CURRENT_SOURCE_DIR}/src/main/jniLibs/armeabi/libavutil-55.so )
 #add_library(swresample-lib  SHARED IMPORTED )
 #set_target_properties(swresample-lib PROPERTIES IMPORTED_LOCATION
 #                      ${CMAKE_CURRENT_SOURCE_DIR}/src/main/jniLibs/armeabi/libswresample-2.so )
 #add_library(swscale-lib  SHARED IMPORTED )
 #set_target_properties(swscale-lib PROPERTIES IMPORTED_LOCATION
 #                      ${CMAKE_CURRENT_SOURCE_DIR}/src/main/jniLibs/armeabi/libswscale-4.so )
#
#include_directories(src/main/cpp/include/)
#add_library(
#            native-lib
#             SHARED
#             src/main/cpp/native-lib.cpp )
#add_library(
#             ieim
#             SHARED
#             src/main/cpp/IEIM.cpp )
#add_library(
#             safe
#             SHARED
#             src/main/cpp/safe.cpp )
#find_library(
#              log-lib
#              log )
#
#target_link_libraries(
#                       native-lib
#                       ${log-lib}
#
#                       avcodec-lib
#                       avdevice-lib
#                       avfilter-lib
#                       avformat-lib
#                       avutil-lib
#                        swresample-lib
#                        swscale-lib
#
#                         ieim
#                         safe
#
#
# )

