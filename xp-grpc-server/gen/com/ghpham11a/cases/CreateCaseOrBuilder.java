// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: proto/cases.proto
// Protobuf Java Version: 4.29.3

package com.ghpham11a.cases;

public interface CreateCaseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.ghpham11a.cases.CreateCase)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.com.ghpham11a.cases.OpenCase open_case = 1 [json_name = "openCase"];</code>
   * @return Whether the openCase field is set.
   */
  boolean hasOpenCase();
  /**
   * <code>.com.ghpham11a.cases.OpenCase open_case = 1 [json_name = "openCase"];</code>
   * @return The openCase.
   */
  com.ghpham11a.cases.OpenCase getOpenCase();
  /**
   * <code>.com.ghpham11a.cases.OpenCase open_case = 1 [json_name = "openCase"];</code>
   */
  com.ghpham11a.cases.OpenCaseOrBuilder getOpenCaseOrBuilder();

  /**
   * <code>.com.ghpham11a.cases.ClosedCase closed_case = 2 [json_name = "closedCase"];</code>
   * @return Whether the closedCase field is set.
   */
  boolean hasClosedCase();
  /**
   * <code>.com.ghpham11a.cases.ClosedCase closed_case = 2 [json_name = "closedCase"];</code>
   * @return The closedCase.
   */
  com.ghpham11a.cases.ClosedCase getClosedCase();
  /**
   * <code>.com.ghpham11a.cases.ClosedCase closed_case = 2 [json_name = "closedCase"];</code>
   */
  com.ghpham11a.cases.ClosedCaseOrBuilder getClosedCaseOrBuilder();

  com.ghpham11a.cases.CreateCase.CaseVariantCase getCaseVariantCase();
}
