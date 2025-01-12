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

func GetBotmanResponseAction(ctx *pulumi.Context, args *GetBotmanResponseActionArgs, opts ...pulumi.InvokeOption) (*GetBotmanResponseActionResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetBotmanResponseActionResult
	err := ctx.Invoke("akamai:index/getBotmanResponseAction:getBotmanResponseAction", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getBotmanResponseAction.
type GetBotmanResponseActionArgs struct {
	ActionId *string `pulumi:"actionId"`
	ConfigId int     `pulumi:"configId"`
}

// A collection of values returned by getBotmanResponseAction.
type GetBotmanResponseActionResult struct {
	ActionId *string `pulumi:"actionId"`
	ConfigId int     `pulumi:"configId"`
	// The provider-assigned unique ID for this managed resource.
	Id   string `pulumi:"id"`
	Json string `pulumi:"json"`
}

func GetBotmanResponseActionOutput(ctx *pulumi.Context, args GetBotmanResponseActionOutputArgs, opts ...pulumi.InvokeOption) GetBotmanResponseActionResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetBotmanResponseActionResult, error) {
			args := v.(GetBotmanResponseActionArgs)
			r, err := GetBotmanResponseAction(ctx, &args, opts...)
			var s GetBotmanResponseActionResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetBotmanResponseActionResultOutput)
}

// A collection of arguments for invoking getBotmanResponseAction.
type GetBotmanResponseActionOutputArgs struct {
	ActionId pulumi.StringPtrInput `pulumi:"actionId"`
	ConfigId pulumi.IntInput       `pulumi:"configId"`
}

func (GetBotmanResponseActionOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetBotmanResponseActionArgs)(nil)).Elem()
}

// A collection of values returned by getBotmanResponseAction.
type GetBotmanResponseActionResultOutput struct{ *pulumi.OutputState }

func (GetBotmanResponseActionResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetBotmanResponseActionResult)(nil)).Elem()
}

func (o GetBotmanResponseActionResultOutput) ToGetBotmanResponseActionResultOutput() GetBotmanResponseActionResultOutput {
	return o
}

func (o GetBotmanResponseActionResultOutput) ToGetBotmanResponseActionResultOutputWithContext(ctx context.Context) GetBotmanResponseActionResultOutput {
	return o
}

func (o GetBotmanResponseActionResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetBotmanResponseActionResult] {
	return pulumix.Output[GetBotmanResponseActionResult]{
		OutputState: o.OutputState,
	}
}

func (o GetBotmanResponseActionResultOutput) ActionId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetBotmanResponseActionResult) *string { return v.ActionId }).(pulumi.StringPtrOutput)
}

func (o GetBotmanResponseActionResultOutput) ConfigId() pulumi.IntOutput {
	return o.ApplyT(func(v GetBotmanResponseActionResult) int { return v.ConfigId }).(pulumi.IntOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetBotmanResponseActionResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetBotmanResponseActionResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetBotmanResponseActionResultOutput) Json() pulumi.StringOutput {
	return o.ApplyT(func(v GetBotmanResponseActionResult) string { return v.Json }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetBotmanResponseActionResultOutput{})
}
