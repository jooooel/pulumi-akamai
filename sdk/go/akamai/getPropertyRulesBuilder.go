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

func GetPropertyRulesBuilder(ctx *pulumi.Context, args *GetPropertyRulesBuilderArgs, opts ...pulumi.InvokeOption) (*GetPropertyRulesBuilderResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetPropertyRulesBuilderResult
	err := ctx.Invoke("akamai:index/getPropertyRulesBuilder:getPropertyRulesBuilder", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getPropertyRulesBuilder.
type GetPropertyRulesBuilderArgs struct {
	RulesV20230105 *GetPropertyRulesBuilderRulesV20230105 `pulumi:"rulesV20230105"`
	RulesV20230530 *GetPropertyRulesBuilderRulesV20230530 `pulumi:"rulesV20230530"`
}

// A collection of values returned by getPropertyRulesBuilder.
type GetPropertyRulesBuilderResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id             string                                 `pulumi:"id"`
	Json           string                                 `pulumi:"json"`
	RuleFormat     string                                 `pulumi:"ruleFormat"`
	RulesV20230105 *GetPropertyRulesBuilderRulesV20230105 `pulumi:"rulesV20230105"`
	RulesV20230530 *GetPropertyRulesBuilderRulesV20230530 `pulumi:"rulesV20230530"`
}

func GetPropertyRulesBuilderOutput(ctx *pulumi.Context, args GetPropertyRulesBuilderOutputArgs, opts ...pulumi.InvokeOption) GetPropertyRulesBuilderResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetPropertyRulesBuilderResult, error) {
			args := v.(GetPropertyRulesBuilderArgs)
			r, err := GetPropertyRulesBuilder(ctx, &args, opts...)
			var s GetPropertyRulesBuilderResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetPropertyRulesBuilderResultOutput)
}

// A collection of arguments for invoking getPropertyRulesBuilder.
type GetPropertyRulesBuilderOutputArgs struct {
	RulesV20230105 GetPropertyRulesBuilderRulesV20230105PtrInput `pulumi:"rulesV20230105"`
	RulesV20230530 GetPropertyRulesBuilderRulesV20230530PtrInput `pulumi:"rulesV20230530"`
}

func (GetPropertyRulesBuilderOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetPropertyRulesBuilderArgs)(nil)).Elem()
}

// A collection of values returned by getPropertyRulesBuilder.
type GetPropertyRulesBuilderResultOutput struct{ *pulumi.OutputState }

func (GetPropertyRulesBuilderResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetPropertyRulesBuilderResult)(nil)).Elem()
}

func (o GetPropertyRulesBuilderResultOutput) ToGetPropertyRulesBuilderResultOutput() GetPropertyRulesBuilderResultOutput {
	return o
}

func (o GetPropertyRulesBuilderResultOutput) ToGetPropertyRulesBuilderResultOutputWithContext(ctx context.Context) GetPropertyRulesBuilderResultOutput {
	return o
}

func (o GetPropertyRulesBuilderResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetPropertyRulesBuilderResult] {
	return pulumix.Output[GetPropertyRulesBuilderResult]{
		OutputState: o.OutputState,
	}
}

// The provider-assigned unique ID for this managed resource.
func (o GetPropertyRulesBuilderResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetPropertyRulesBuilderResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetPropertyRulesBuilderResultOutput) Json() pulumi.StringOutput {
	return o.ApplyT(func(v GetPropertyRulesBuilderResult) string { return v.Json }).(pulumi.StringOutput)
}

func (o GetPropertyRulesBuilderResultOutput) RuleFormat() pulumi.StringOutput {
	return o.ApplyT(func(v GetPropertyRulesBuilderResult) string { return v.RuleFormat }).(pulumi.StringOutput)
}

func (o GetPropertyRulesBuilderResultOutput) RulesV20230105() GetPropertyRulesBuilderRulesV20230105PtrOutput {
	return o.ApplyT(func(v GetPropertyRulesBuilderResult) *GetPropertyRulesBuilderRulesV20230105 { return v.RulesV20230105 }).(GetPropertyRulesBuilderRulesV20230105PtrOutput)
}

func (o GetPropertyRulesBuilderResultOutput) RulesV20230530() GetPropertyRulesBuilderRulesV20230530PtrOutput {
	return o.ApplyT(func(v GetPropertyRulesBuilderResult) *GetPropertyRulesBuilderRulesV20230530 { return v.RulesV20230530 }).(GetPropertyRulesBuilderRulesV20230530PtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetPropertyRulesBuilderResultOutput{})
}
