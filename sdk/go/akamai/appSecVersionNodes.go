// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package akamai

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// **Scopes**: Security configuration
//
// Updates the version notes for a security configuration.
//
// **Related API Endpoint**: [/appsec/v1/configs/{configId}/versions/{versionNumber}/version-notes](https://developer.akamai.com/api/cloud_security/application_security/v1.html#putversionnotes)
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
// 		configuration, err := akamai.LookupAppSecConfiguration(ctx, &GetAppSecConfigurationArgs{
// 			Name: pulumi.StringRef("Documentation"),
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		versionNotesAppSecVersionNodes, err := akamai.NewAppSecVersionNodes(ctx, "versionNotesAppSecVersionNodes", &akamai.AppSecVersionNodesArgs{
// 			ConfigId:     pulumi.Int(configuration.ConfigId),
// 			VersionNotes: pulumi.String("This version enables reputation profiles."),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		ctx.Export("versionNotes", versionNotesAppSecVersionNodes.OutputText)
// 		return nil
// 	})
// }
// ```
// ## Output Options
//
// The following options can be used to determine the information returned, and how that returned information is formatted:
//
// - `outputText`. Tabular report showing the updated version notes.
type AppSecVersionNodes struct {
	pulumi.CustomResourceState

	// . Unique identifier of the security configuration whose version notes are being modified.
	ConfigId pulumi.IntOutput `pulumi:"configId"`
	// Text Export representation
	OutputText pulumi.StringOutput `pulumi:"outputText"`
	// . Brief description of the security configuration version.
	VersionNotes pulumi.StringOutput `pulumi:"versionNotes"`
}

// NewAppSecVersionNodes registers a new resource with the given unique name, arguments, and options.
func NewAppSecVersionNodes(ctx *pulumi.Context,
	name string, args *AppSecVersionNodesArgs, opts ...pulumi.ResourceOption) (*AppSecVersionNodes, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ConfigId == nil {
		return nil, errors.New("invalid value for required argument 'ConfigId'")
	}
	if args.VersionNotes == nil {
		return nil, errors.New("invalid value for required argument 'VersionNotes'")
	}
	var resource AppSecVersionNodes
	err := ctx.RegisterResource("akamai:index/appSecVersionNodes:AppSecVersionNodes", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAppSecVersionNodes gets an existing AppSecVersionNodes resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAppSecVersionNodes(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AppSecVersionNodesState, opts ...pulumi.ResourceOption) (*AppSecVersionNodes, error) {
	var resource AppSecVersionNodes
	err := ctx.ReadResource("akamai:index/appSecVersionNodes:AppSecVersionNodes", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AppSecVersionNodes resources.
type appSecVersionNodesState struct {
	// . Unique identifier of the security configuration whose version notes are being modified.
	ConfigId *int `pulumi:"configId"`
	// Text Export representation
	OutputText *string `pulumi:"outputText"`
	// . Brief description of the security configuration version.
	VersionNotes *string `pulumi:"versionNotes"`
}

type AppSecVersionNodesState struct {
	// . Unique identifier of the security configuration whose version notes are being modified.
	ConfigId pulumi.IntPtrInput
	// Text Export representation
	OutputText pulumi.StringPtrInput
	// . Brief description of the security configuration version.
	VersionNotes pulumi.StringPtrInput
}

func (AppSecVersionNodesState) ElementType() reflect.Type {
	return reflect.TypeOf((*appSecVersionNodesState)(nil)).Elem()
}

type appSecVersionNodesArgs struct {
	// . Unique identifier of the security configuration whose version notes are being modified.
	ConfigId int `pulumi:"configId"`
	// . Brief description of the security configuration version.
	VersionNotes string `pulumi:"versionNotes"`
}

// The set of arguments for constructing a AppSecVersionNodes resource.
type AppSecVersionNodesArgs struct {
	// . Unique identifier of the security configuration whose version notes are being modified.
	ConfigId pulumi.IntInput
	// . Brief description of the security configuration version.
	VersionNotes pulumi.StringInput
}

func (AppSecVersionNodesArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*appSecVersionNodesArgs)(nil)).Elem()
}

type AppSecVersionNodesInput interface {
	pulumi.Input

	ToAppSecVersionNodesOutput() AppSecVersionNodesOutput
	ToAppSecVersionNodesOutputWithContext(ctx context.Context) AppSecVersionNodesOutput
}

func (*AppSecVersionNodes) ElementType() reflect.Type {
	return reflect.TypeOf((**AppSecVersionNodes)(nil)).Elem()
}

func (i *AppSecVersionNodes) ToAppSecVersionNodesOutput() AppSecVersionNodesOutput {
	return i.ToAppSecVersionNodesOutputWithContext(context.Background())
}

func (i *AppSecVersionNodes) ToAppSecVersionNodesOutputWithContext(ctx context.Context) AppSecVersionNodesOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppSecVersionNodesOutput)
}

// AppSecVersionNodesArrayInput is an input type that accepts AppSecVersionNodesArray and AppSecVersionNodesArrayOutput values.
// You can construct a concrete instance of `AppSecVersionNodesArrayInput` via:
//
//          AppSecVersionNodesArray{ AppSecVersionNodesArgs{...} }
type AppSecVersionNodesArrayInput interface {
	pulumi.Input

	ToAppSecVersionNodesArrayOutput() AppSecVersionNodesArrayOutput
	ToAppSecVersionNodesArrayOutputWithContext(context.Context) AppSecVersionNodesArrayOutput
}

type AppSecVersionNodesArray []AppSecVersionNodesInput

func (AppSecVersionNodesArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AppSecVersionNodes)(nil)).Elem()
}

func (i AppSecVersionNodesArray) ToAppSecVersionNodesArrayOutput() AppSecVersionNodesArrayOutput {
	return i.ToAppSecVersionNodesArrayOutputWithContext(context.Background())
}

func (i AppSecVersionNodesArray) ToAppSecVersionNodesArrayOutputWithContext(ctx context.Context) AppSecVersionNodesArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppSecVersionNodesArrayOutput)
}

// AppSecVersionNodesMapInput is an input type that accepts AppSecVersionNodesMap and AppSecVersionNodesMapOutput values.
// You can construct a concrete instance of `AppSecVersionNodesMapInput` via:
//
//          AppSecVersionNodesMap{ "key": AppSecVersionNodesArgs{...} }
type AppSecVersionNodesMapInput interface {
	pulumi.Input

	ToAppSecVersionNodesMapOutput() AppSecVersionNodesMapOutput
	ToAppSecVersionNodesMapOutputWithContext(context.Context) AppSecVersionNodesMapOutput
}

type AppSecVersionNodesMap map[string]AppSecVersionNodesInput

func (AppSecVersionNodesMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AppSecVersionNodes)(nil)).Elem()
}

func (i AppSecVersionNodesMap) ToAppSecVersionNodesMapOutput() AppSecVersionNodesMapOutput {
	return i.ToAppSecVersionNodesMapOutputWithContext(context.Background())
}

func (i AppSecVersionNodesMap) ToAppSecVersionNodesMapOutputWithContext(ctx context.Context) AppSecVersionNodesMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppSecVersionNodesMapOutput)
}

type AppSecVersionNodesOutput struct{ *pulumi.OutputState }

func (AppSecVersionNodesOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AppSecVersionNodes)(nil)).Elem()
}

func (o AppSecVersionNodesOutput) ToAppSecVersionNodesOutput() AppSecVersionNodesOutput {
	return o
}

func (o AppSecVersionNodesOutput) ToAppSecVersionNodesOutputWithContext(ctx context.Context) AppSecVersionNodesOutput {
	return o
}

type AppSecVersionNodesArrayOutput struct{ *pulumi.OutputState }

func (AppSecVersionNodesArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AppSecVersionNodes)(nil)).Elem()
}

func (o AppSecVersionNodesArrayOutput) ToAppSecVersionNodesArrayOutput() AppSecVersionNodesArrayOutput {
	return o
}

func (o AppSecVersionNodesArrayOutput) ToAppSecVersionNodesArrayOutputWithContext(ctx context.Context) AppSecVersionNodesArrayOutput {
	return o
}

func (o AppSecVersionNodesArrayOutput) Index(i pulumi.IntInput) AppSecVersionNodesOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AppSecVersionNodes {
		return vs[0].([]*AppSecVersionNodes)[vs[1].(int)]
	}).(AppSecVersionNodesOutput)
}

type AppSecVersionNodesMapOutput struct{ *pulumi.OutputState }

func (AppSecVersionNodesMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AppSecVersionNodes)(nil)).Elem()
}

func (o AppSecVersionNodesMapOutput) ToAppSecVersionNodesMapOutput() AppSecVersionNodesMapOutput {
	return o
}

func (o AppSecVersionNodesMapOutput) ToAppSecVersionNodesMapOutputWithContext(ctx context.Context) AppSecVersionNodesMapOutput {
	return o
}

func (o AppSecVersionNodesMapOutput) MapIndex(k pulumi.StringInput) AppSecVersionNodesOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AppSecVersionNodes {
		return vs[0].(map[string]*AppSecVersionNodes)[vs[1].(string)]
	}).(AppSecVersionNodesOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AppSecVersionNodesInput)(nil)).Elem(), &AppSecVersionNodes{})
	pulumi.RegisterInputType(reflect.TypeOf((*AppSecVersionNodesArrayInput)(nil)).Elem(), AppSecVersionNodesArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AppSecVersionNodesMapInput)(nil)).Elem(), AppSecVersionNodesMap{})
	pulumi.RegisterOutputType(AppSecVersionNodesOutput{})
	pulumi.RegisterOutputType(AppSecVersionNodesArrayOutput{})
	pulumi.RegisterOutputType(AppSecVersionNodesMapOutput{})
}