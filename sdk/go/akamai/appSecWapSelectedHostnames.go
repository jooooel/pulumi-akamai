// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package akamai

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

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
// 		configuration, err := akamai.LookupAppSecConfiguration(ctx, &GetAppSecConfigurationArgs{
// 			Name: pulumi.StringRef("Documentation"),
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		_, err = akamai.NewAppSecWapSelectedHostnames(ctx, "appsecwapSelectedhostnames", &akamai.AppSecWapSelectedHostnamesArgs{
// 			ConfigId:         pulumi.Int(configuration.ConfigId),
// 			SecurityPolicyId: pulumi.String("gms1_134637"),
// 			ProtectedHosts: pulumi.StringArray{
// 				pulumi.String("documentation.akamai.com"),
// 			},
// 			EvaluatedHosts: pulumi.StringArray{
// 				pulumi.String("training.akamai.com"),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
type AppSecWapSelectedHostnames struct {
	pulumi.CustomResourceState

	// . Unique identifier of the security configuration associated with the hostnames being protected or evaluated.
	ConfigId       pulumi.IntOutput         `pulumi:"configId"`
	EvaluatedHosts pulumi.StringArrayOutput `pulumi:"evaluatedHosts"`
	ProtectedHosts pulumi.StringArrayOutput `pulumi:"protectedHosts"`
	// . Unique identifier of the security policy responsible for protecting or evaluating the specified hosts.
	SecurityPolicyId pulumi.StringOutput `pulumi:"securityPolicyId"`
}

// NewAppSecWapSelectedHostnames registers a new resource with the given unique name, arguments, and options.
func NewAppSecWapSelectedHostnames(ctx *pulumi.Context,
	name string, args *AppSecWapSelectedHostnamesArgs, opts ...pulumi.ResourceOption) (*AppSecWapSelectedHostnames, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ConfigId == nil {
		return nil, errors.New("invalid value for required argument 'ConfigId'")
	}
	if args.SecurityPolicyId == nil {
		return nil, errors.New("invalid value for required argument 'SecurityPolicyId'")
	}
	var resource AppSecWapSelectedHostnames
	err := ctx.RegisterResource("akamai:index/appSecWapSelectedHostnames:AppSecWapSelectedHostnames", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAppSecWapSelectedHostnames gets an existing AppSecWapSelectedHostnames resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAppSecWapSelectedHostnames(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AppSecWapSelectedHostnamesState, opts ...pulumi.ResourceOption) (*AppSecWapSelectedHostnames, error) {
	var resource AppSecWapSelectedHostnames
	err := ctx.ReadResource("akamai:index/appSecWapSelectedHostnames:AppSecWapSelectedHostnames", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AppSecWapSelectedHostnames resources.
type appSecWapSelectedHostnamesState struct {
	// . Unique identifier of the security configuration associated with the hostnames being protected or evaluated.
	ConfigId       *int     `pulumi:"configId"`
	EvaluatedHosts []string `pulumi:"evaluatedHosts"`
	ProtectedHosts []string `pulumi:"protectedHosts"`
	// . Unique identifier of the security policy responsible for protecting or evaluating the specified hosts.
	SecurityPolicyId *string `pulumi:"securityPolicyId"`
}

type AppSecWapSelectedHostnamesState struct {
	// . Unique identifier of the security configuration associated with the hostnames being protected or evaluated.
	ConfigId       pulumi.IntPtrInput
	EvaluatedHosts pulumi.StringArrayInput
	ProtectedHosts pulumi.StringArrayInput
	// . Unique identifier of the security policy responsible for protecting or evaluating the specified hosts.
	SecurityPolicyId pulumi.StringPtrInput
}

func (AppSecWapSelectedHostnamesState) ElementType() reflect.Type {
	return reflect.TypeOf((*appSecWapSelectedHostnamesState)(nil)).Elem()
}

type appSecWapSelectedHostnamesArgs struct {
	// . Unique identifier of the security configuration associated with the hostnames being protected or evaluated.
	ConfigId       int      `pulumi:"configId"`
	EvaluatedHosts []string `pulumi:"evaluatedHosts"`
	ProtectedHosts []string `pulumi:"protectedHosts"`
	// . Unique identifier of the security policy responsible for protecting or evaluating the specified hosts.
	SecurityPolicyId string `pulumi:"securityPolicyId"`
}

// The set of arguments for constructing a AppSecWapSelectedHostnames resource.
type AppSecWapSelectedHostnamesArgs struct {
	// . Unique identifier of the security configuration associated with the hostnames being protected or evaluated.
	ConfigId       pulumi.IntInput
	EvaluatedHosts pulumi.StringArrayInput
	ProtectedHosts pulumi.StringArrayInput
	// . Unique identifier of the security policy responsible for protecting or evaluating the specified hosts.
	SecurityPolicyId pulumi.StringInput
}

func (AppSecWapSelectedHostnamesArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*appSecWapSelectedHostnamesArgs)(nil)).Elem()
}

type AppSecWapSelectedHostnamesInput interface {
	pulumi.Input

	ToAppSecWapSelectedHostnamesOutput() AppSecWapSelectedHostnamesOutput
	ToAppSecWapSelectedHostnamesOutputWithContext(ctx context.Context) AppSecWapSelectedHostnamesOutput
}

func (*AppSecWapSelectedHostnames) ElementType() reflect.Type {
	return reflect.TypeOf((**AppSecWapSelectedHostnames)(nil)).Elem()
}

func (i *AppSecWapSelectedHostnames) ToAppSecWapSelectedHostnamesOutput() AppSecWapSelectedHostnamesOutput {
	return i.ToAppSecWapSelectedHostnamesOutputWithContext(context.Background())
}

func (i *AppSecWapSelectedHostnames) ToAppSecWapSelectedHostnamesOutputWithContext(ctx context.Context) AppSecWapSelectedHostnamesOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppSecWapSelectedHostnamesOutput)
}

// AppSecWapSelectedHostnamesArrayInput is an input type that accepts AppSecWapSelectedHostnamesArray and AppSecWapSelectedHostnamesArrayOutput values.
// You can construct a concrete instance of `AppSecWapSelectedHostnamesArrayInput` via:
//
//          AppSecWapSelectedHostnamesArray{ AppSecWapSelectedHostnamesArgs{...} }
type AppSecWapSelectedHostnamesArrayInput interface {
	pulumi.Input

	ToAppSecWapSelectedHostnamesArrayOutput() AppSecWapSelectedHostnamesArrayOutput
	ToAppSecWapSelectedHostnamesArrayOutputWithContext(context.Context) AppSecWapSelectedHostnamesArrayOutput
}

type AppSecWapSelectedHostnamesArray []AppSecWapSelectedHostnamesInput

func (AppSecWapSelectedHostnamesArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AppSecWapSelectedHostnames)(nil)).Elem()
}

func (i AppSecWapSelectedHostnamesArray) ToAppSecWapSelectedHostnamesArrayOutput() AppSecWapSelectedHostnamesArrayOutput {
	return i.ToAppSecWapSelectedHostnamesArrayOutputWithContext(context.Background())
}

func (i AppSecWapSelectedHostnamesArray) ToAppSecWapSelectedHostnamesArrayOutputWithContext(ctx context.Context) AppSecWapSelectedHostnamesArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppSecWapSelectedHostnamesArrayOutput)
}

// AppSecWapSelectedHostnamesMapInput is an input type that accepts AppSecWapSelectedHostnamesMap and AppSecWapSelectedHostnamesMapOutput values.
// You can construct a concrete instance of `AppSecWapSelectedHostnamesMapInput` via:
//
//          AppSecWapSelectedHostnamesMap{ "key": AppSecWapSelectedHostnamesArgs{...} }
type AppSecWapSelectedHostnamesMapInput interface {
	pulumi.Input

	ToAppSecWapSelectedHostnamesMapOutput() AppSecWapSelectedHostnamesMapOutput
	ToAppSecWapSelectedHostnamesMapOutputWithContext(context.Context) AppSecWapSelectedHostnamesMapOutput
}

type AppSecWapSelectedHostnamesMap map[string]AppSecWapSelectedHostnamesInput

func (AppSecWapSelectedHostnamesMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AppSecWapSelectedHostnames)(nil)).Elem()
}

func (i AppSecWapSelectedHostnamesMap) ToAppSecWapSelectedHostnamesMapOutput() AppSecWapSelectedHostnamesMapOutput {
	return i.ToAppSecWapSelectedHostnamesMapOutputWithContext(context.Background())
}

func (i AppSecWapSelectedHostnamesMap) ToAppSecWapSelectedHostnamesMapOutputWithContext(ctx context.Context) AppSecWapSelectedHostnamesMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppSecWapSelectedHostnamesMapOutput)
}

type AppSecWapSelectedHostnamesOutput struct{ *pulumi.OutputState }

func (AppSecWapSelectedHostnamesOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AppSecWapSelectedHostnames)(nil)).Elem()
}

func (o AppSecWapSelectedHostnamesOutput) ToAppSecWapSelectedHostnamesOutput() AppSecWapSelectedHostnamesOutput {
	return o
}

func (o AppSecWapSelectedHostnamesOutput) ToAppSecWapSelectedHostnamesOutputWithContext(ctx context.Context) AppSecWapSelectedHostnamesOutput {
	return o
}

type AppSecWapSelectedHostnamesArrayOutput struct{ *pulumi.OutputState }

func (AppSecWapSelectedHostnamesArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AppSecWapSelectedHostnames)(nil)).Elem()
}

func (o AppSecWapSelectedHostnamesArrayOutput) ToAppSecWapSelectedHostnamesArrayOutput() AppSecWapSelectedHostnamesArrayOutput {
	return o
}

func (o AppSecWapSelectedHostnamesArrayOutput) ToAppSecWapSelectedHostnamesArrayOutputWithContext(ctx context.Context) AppSecWapSelectedHostnamesArrayOutput {
	return o
}

func (o AppSecWapSelectedHostnamesArrayOutput) Index(i pulumi.IntInput) AppSecWapSelectedHostnamesOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AppSecWapSelectedHostnames {
		return vs[0].([]*AppSecWapSelectedHostnames)[vs[1].(int)]
	}).(AppSecWapSelectedHostnamesOutput)
}

type AppSecWapSelectedHostnamesMapOutput struct{ *pulumi.OutputState }

func (AppSecWapSelectedHostnamesMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AppSecWapSelectedHostnames)(nil)).Elem()
}

func (o AppSecWapSelectedHostnamesMapOutput) ToAppSecWapSelectedHostnamesMapOutput() AppSecWapSelectedHostnamesMapOutput {
	return o
}

func (o AppSecWapSelectedHostnamesMapOutput) ToAppSecWapSelectedHostnamesMapOutputWithContext(ctx context.Context) AppSecWapSelectedHostnamesMapOutput {
	return o
}

func (o AppSecWapSelectedHostnamesMapOutput) MapIndex(k pulumi.StringInput) AppSecWapSelectedHostnamesOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AppSecWapSelectedHostnames {
		return vs[0].(map[string]*AppSecWapSelectedHostnames)[vs[1].(string)]
	}).(AppSecWapSelectedHostnamesOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AppSecWapSelectedHostnamesInput)(nil)).Elem(), &AppSecWapSelectedHostnames{})
	pulumi.RegisterInputType(reflect.TypeOf((*AppSecWapSelectedHostnamesArrayInput)(nil)).Elem(), AppSecWapSelectedHostnamesArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AppSecWapSelectedHostnamesMapInput)(nil)).Elem(), AppSecWapSelectedHostnamesMap{})
	pulumi.RegisterOutputType(AppSecWapSelectedHostnamesOutput{})
	pulumi.RegisterOutputType(AppSecWapSelectedHostnamesArrayOutput{})
	pulumi.RegisterOutputType(AppSecWapSelectedHostnamesMapOutput{})
}