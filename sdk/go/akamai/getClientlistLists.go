// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package akamai

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-akamai/sdk/v6/go/akamai/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

func GetClientlistLists(ctx *pulumi.Context, args *GetClientlistListsArgs, opts ...pulumi.InvokeOption) (*GetClientlistListsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetClientlistListsResult
	err := ctx.Invoke("akamai:index/getClientlistLists:getClientlistLists", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getClientlistLists.
type GetClientlistListsArgs struct {
	Name  *string  `pulumi:"name"`
	Types []string `pulumi:"types"`
}

// A collection of values returned by getClientlistLists.
type GetClientlistListsResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id         string                   `pulumi:"id"`
	Json       string                   `pulumi:"json"`
	ListIds    []string                 `pulumi:"listIds"`
	Lists      []GetClientlistListsList `pulumi:"lists"`
	Name       *string                  `pulumi:"name"`
	OutputText string                   `pulumi:"outputText"`
	Types      []string                 `pulumi:"types"`
}

func GetClientlistListsOutput(ctx *pulumi.Context, args GetClientlistListsOutputArgs, opts ...pulumi.InvokeOption) GetClientlistListsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetClientlistListsResult, error) {
			args := v.(GetClientlistListsArgs)
			r, err := GetClientlistLists(ctx, &args, opts...)
			var s GetClientlistListsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetClientlistListsResultOutput)
}

// A collection of arguments for invoking getClientlistLists.
type GetClientlistListsOutputArgs struct {
	Name  pulumi.StringPtrInput   `pulumi:"name"`
	Types pulumi.StringArrayInput `pulumi:"types"`
}

func (GetClientlistListsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetClientlistListsArgs)(nil)).Elem()
}

// A collection of values returned by getClientlistLists.
type GetClientlistListsResultOutput struct{ *pulumi.OutputState }

func (GetClientlistListsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetClientlistListsResult)(nil)).Elem()
}

func (o GetClientlistListsResultOutput) ToGetClientlistListsResultOutput() GetClientlistListsResultOutput {
	return o
}

func (o GetClientlistListsResultOutput) ToGetClientlistListsResultOutputWithContext(ctx context.Context) GetClientlistListsResultOutput {
	return o
}

func (o GetClientlistListsResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetClientlistListsResult] {
	return pulumix.Output[GetClientlistListsResult]{
		OutputState: o.OutputState,
	}
}

// The provider-assigned unique ID for this managed resource.
func (o GetClientlistListsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetClientlistListsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetClientlistListsResultOutput) Json() pulumi.StringOutput {
	return o.ApplyT(func(v GetClientlistListsResult) string { return v.Json }).(pulumi.StringOutput)
}

func (o GetClientlistListsResultOutput) ListIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetClientlistListsResult) []string { return v.ListIds }).(pulumi.StringArrayOutput)
}

func (o GetClientlistListsResultOutput) Lists() GetClientlistListsListArrayOutput {
	return o.ApplyT(func(v GetClientlistListsResult) []GetClientlistListsList { return v.Lists }).(GetClientlistListsListArrayOutput)
}

func (o GetClientlistListsResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetClientlistListsResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

func (o GetClientlistListsResultOutput) OutputText() pulumi.StringOutput {
	return o.ApplyT(func(v GetClientlistListsResult) string { return v.OutputText }).(pulumi.StringOutput)
}

func (o GetClientlistListsResultOutput) Types() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetClientlistListsResult) []string { return v.Types }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetClientlistListsResultOutput{})
}