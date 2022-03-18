// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package akamai

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// **Scopes**: SIEM definition
//
// Returns information about your SIEM (Security Information and Event Management) versions. The returned information is described in the [Get SIEM versions](https://developer.akamai.com/api/cloud_security/application_security/v1.html#getsiemversions) section of the Application Security API.
//
// **Related API Endpoint**: [/appsec/v1/siem-definitions](https://developer.akamai.com/api/cloud_security/application_security/v1.html#getsiemversions)
//
// ## Example Usage
//
// Basic usage:
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-akamai/sdk/v2/go/akamai"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		siemDefinitions, err := akamai.GetAppSecSiemDefinitions(ctx, nil, nil)
// 		if err != nil {
// 			return err
// 		}
// 		ctx.Export("siemDefinitionsJson", siemDefinitions.Json)
// 		ctx.Export("siemDefinitionsOutput", siemDefinitions.OutputText)
// 		siemDefinition, err := akamai.GetAppSecSiemDefinitions(ctx, &GetAppSecSiemDefinitionsArgs{
// 			SiemDefinitionName: pulumi.StringRef("SIEM Version 01"),
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		ctx.Export("siemDefinitionId", siemDefinition.Id)
// 		return nil
// 	})
// }
// ```
// ## Output Options
//
// The following options can be used to determine the information returned, and how that returned information is formatted:
//
// - `json`. JSON-formatted list of the SIEM version information.
// - `outputText`. Tabular report showing the ID and name of each SIEM version.
func GetAppSecSiemDefinitions(ctx *pulumi.Context, args *GetAppSecSiemDefinitionsArgs, opts ...pulumi.InvokeOption) (*GetAppSecSiemDefinitionsResult, error) {
	var rv GetAppSecSiemDefinitionsResult
	err := ctx.Invoke("akamai:index/getAppSecSiemDefinitions:getAppSecSiemDefinitions", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAppSecSiemDefinitions.
type GetAppSecSiemDefinitionsArgs struct {
	// . Name of the SIEM definition you want to return information for. If not included, information is returned for all your SIEM definitions.
	SiemDefinitionName *string `pulumi:"siemDefinitionName"`
}

// A collection of values returned by getAppSecSiemDefinitions.
type GetAppSecSiemDefinitionsResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id                 string  `pulumi:"id"`
	Json               string  `pulumi:"json"`
	OutputText         string  `pulumi:"outputText"`
	SiemDefinitionName *string `pulumi:"siemDefinitionName"`
}

func GetAppSecSiemDefinitionsOutput(ctx *pulumi.Context, args GetAppSecSiemDefinitionsOutputArgs, opts ...pulumi.InvokeOption) GetAppSecSiemDefinitionsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetAppSecSiemDefinitionsResult, error) {
			args := v.(GetAppSecSiemDefinitionsArgs)
			r, err := GetAppSecSiemDefinitions(ctx, &args, opts...)
			return *r, err
		}).(GetAppSecSiemDefinitionsResultOutput)
}

// A collection of arguments for invoking getAppSecSiemDefinitions.
type GetAppSecSiemDefinitionsOutputArgs struct {
	// . Name of the SIEM definition you want to return information for. If not included, information is returned for all your SIEM definitions.
	SiemDefinitionName pulumi.StringPtrInput `pulumi:"siemDefinitionName"`
}

func (GetAppSecSiemDefinitionsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAppSecSiemDefinitionsArgs)(nil)).Elem()
}

// A collection of values returned by getAppSecSiemDefinitions.
type GetAppSecSiemDefinitionsResultOutput struct{ *pulumi.OutputState }

func (GetAppSecSiemDefinitionsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAppSecSiemDefinitionsResult)(nil)).Elem()
}

func (o GetAppSecSiemDefinitionsResultOutput) ToGetAppSecSiemDefinitionsResultOutput() GetAppSecSiemDefinitionsResultOutput {
	return o
}

func (o GetAppSecSiemDefinitionsResultOutput) ToGetAppSecSiemDefinitionsResultOutputWithContext(ctx context.Context) GetAppSecSiemDefinitionsResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetAppSecSiemDefinitionsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetAppSecSiemDefinitionsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetAppSecSiemDefinitionsResultOutput) Json() pulumi.StringOutput {
	return o.ApplyT(func(v GetAppSecSiemDefinitionsResult) string { return v.Json }).(pulumi.StringOutput)
}

func (o GetAppSecSiemDefinitionsResultOutput) OutputText() pulumi.StringOutput {
	return o.ApplyT(func(v GetAppSecSiemDefinitionsResult) string { return v.OutputText }).(pulumi.StringOutput)
}

func (o GetAppSecSiemDefinitionsResultOutput) SiemDefinitionName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAppSecSiemDefinitionsResult) *string { return v.SiemDefinitionName }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetAppSecSiemDefinitionsResultOutput{})
}