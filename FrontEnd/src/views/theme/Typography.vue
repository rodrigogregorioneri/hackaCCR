<template>
  <div>


   <CCol md="12">
        <CCard>
          <CCardHeader>
            <strong>Basic Form</strong> Elements
          </CCardHeader>
          <CCardBody>
            <CForm>
              <CInput
                description="Let us know your full name."
                label="Enter your name"
                horizontal
                autocomplete="name"
              />
              <CInput
                label="Static"
                value="Username"
                horizontal
                plaintext
              />
              <CInput
                label="Text input"
                description="This is a help text"
                placeholder="Text"
                horizontal
              />
              <CInput
                label="Date"
                type="date"
                horizontal
              />
              <CInput
                label="Email input"
                description="Please enter your email"
                placeholder="Enter your email"
                type="email"
                horizontal
                autocomplete="email"
              />
              <CInput
                label="Password Input"
                description="Please enter a complex password"
                placeholder="Enter your password"
                type="password"
                horizontal
                autocomplete="current-password"
              />
              <CInput
                label="Disabled Input"
                placeholder="Disabled"
                horizontal
                disabled
              />
              <CTextarea
                label="Textarea"
                placeholder="Content..."
                horizontal
                rows="9"
              />
              <CSelect
                label="Select"
                horizontal
                :options="options"
                placeholder="Please select"
              />
              <CSelect
                label="Large select"
                size="lg"
                horizontal
                :value.sync="selectedOption"
                :options="selectOptions"
                placeholder="Please select"
              />
              <CSelect
                label="Small select"
                size="sm"
                horizontal
                :options="options"
                placeholder="Please select"
              />
              <CSelect
                label="Select"
                horizontal
                :options="options"
                placeholder="Please select"
                disabled
              />
              <template v-for="(name, key) in checkboxNames">
                <CRow form class="form-group" :key="name">
                  <CCol tag="label" sm="3" class="col-form-label">
                    {{name}}
                  </CCol>
                  <CCol sm="9" :class="key % 2 === 1 ? 'form-inline' : ''">
                    <CInputCheckbox
                      v-for="(option, optionIndex) in options"
                      :key="key + option"
                      :label="option"
                      :value="option"
                      :custom="key > 1"
                      :name="`Option 1${key}`"
                      :checked="optionIndex === key"
                      :inline="key % 2 === 1"
                    />
                  </CCol>
                </CRow>
              </template>
              <template v-for="(name, key) in radioNames">
                <CRow form class="form-group" :key="name">
                  <CCol sm="3">
                    {{name}}
                  </CCol>
                  <CInputRadioGroup
                    class="col-sm-9"
                    :options="options"
                    :custom="key > 1"
                    :checked="`Option ${key}`"
                    :inline="key % 2 === 1"
                  />
                </CRow>
              </template>
              <CInputFile
                label="File input"
                horizontal
              />
              <CInputFile
                label="Multiple file input"
                horizontal
                multiple
              />
              <CInputFile
                label="File custom input"
                horizontal
                custom
              />
              <CInputFile
                label="Multiple file custom input"
                horizontal
                multiple
                custom
              />
            </CForm>
          </CCardBody>
          <CCardFooter>
            <CButton type="submit" size="sm" color="primary"><CIcon name="cil-check-circle"/> Submit</CButton>
            <CButton type="reset" size="sm" color="danger"><CIcon name="cil-ban"/> Reset</CButton>
          </CCardFooter>
        </CCard>
        <CCard>
          <CCardHeader>
            <strong>Inline</strong> Form
          </CCardHeader>

          <CCardBody>
            <!-- Bootstrap Vue has some problems with Inline forms that's why we use some standard bootstrap classes -->
            <CForm inline>
              <CInput
                class="mr-2"
                placeholder="Jane Doe"
              >
                <template #label>
                  <small>Name:&nbsp;</small>
                </template>
              </CInput>
              <CInput
                placeholder="jane.doe@example.com"
                autocomplete="email"
              >
                <template #label>
                  <small>Email:&nbsp;</small>
                </template>
              </CInput>
            </CForm>
          </CCardBody>
          <CCardFooter>
            <CButton type="submit" size="sm" color="primary"><CIcon name="cil-check-circle"/> Submit</CButton>
            <CButton type="reset" size="sm" color="danger"><CIcon name="cil-ban"/> Reset</CButton>
          </CCardFooter>
        </CCard>
      </CCol>
      <CCol md="6">
        <CCard>
          <CCardHeader>
            <strong>Horizontal</strong> Form
          </CCardHeader>
          <CCardBody>
            <CForm>
              <CInput
                type="email"
                description="Please enter your email."
                autocomplete="email"
                label="Email"
                horizontal
                placeholder="Enter Email..."
              />
              <CInput
                type="password"
                description="Please enter your password."
                autocomplete="current-password"
                label="Password"
                horizontal
                placeholder="Enter Password..."
              />
            </CForm>
          </CCardBody>
          <CCardFooter>
            <CButton type="submit" size="sm" color="primary"><CIcon name="cil-check-circle"/> Submit</CButton>
            <CButton type="reset" size="sm" color="danger"><CIcon name="cil-ban"/> Reset</CButton>
          </CCardFooter>
        </CCard>
        <CCard>
          <CCardHeader>
            <strong>Normal</strong> Form
          </CCardHeader>
          <CForm novalidate>
            <CCardBody>
              <CInput
                type="email"
                description="Please enter your email."
                autocomplete="email"
                label="Email"
                placeholder="Enter Email..."
                required
                was-validated
              />
              <CInput
                type="password"
                description="Please enter your password."
                autocomplete="current-password"
                label="Password"
                placeholder="Enter Password..."
                required
                was-validated
              />
            </CCardBody>
            <CCardFooter>
              <CButton type="submit" size="sm" color="primary"><CIcon name="cil-check-circle"/> Submit</CButton>
              <CButton type="reset" size="sm" color="danger"><CIcon name="cil-ban"/> Reset</CButton>
            </CCardFooter>
          </CForm>
        </CCard>
        <CCard>
          <CCardHeader>
            Input <strong>Grid</strong>
          </CCardHeader>
          <CCardBody>
            <CRow class="form-group">
              <CCol sm="3">
                <CInput class="mb-0" placeholder=".col-sm-3"/>
              </CCol>
            </CRow>
            <CRow class="form-group">
              <CCol sm="4">
                <CInput class="mb-0" placeholder=".col-sm-4"/>
              </CCol>
            </CRow>
            <CRow class="form-group">
              <CCol sm="5">
                <CInput class="mb-0" placeholder=".col-sm-5"/>
              </CCol>
            </CRow>
            <CRow class="form-group">
              <CCol sm="6">
                <CInput class="mb-0" placeholder=".col-sm-6"/>
              </CCol>
            </CRow>
            <CRow class="form-group">
              <CCol sm="7">
                <CInput class="mb-0" placeholder=".col-sm-7"/>
              </CCol>
            </CRow>
            <CRow class="form-group">
              <CCol sm="8">
                <CInput class="mb-0" placeholder=".col-sm-8"/>
              </CCol>
            </CRow>
            <CRow class="form-group">
              <CCol sm="9">
                <CInput class="mb-0" placeholder=".col-sm-9"/>
              </CCol>
            </CRow>
            <CRow class="form-group">
              <CCol sm="10">
                <CInput class="mb-0" placeholder=".col-sm-10"/>
              </CCol>
            </CRow>
            <CRow class="form-group">
              <CCol sm="11">
                <CInput class="mb-0" placeholder=".col-sm-11"/>
              </CCol>
            </CRow>
            <CRow class="form-group">
              <CCol sm="12">
                <CInput class="mb-0" placeholder=".col-sm-12"/>
              </CCol>
            </CRow>
          </CCardBody>
          <CCardFooter>
            <CButton type="submit" size="sm" color="primary"><CIcon name="cil-user"/> Login</CButton>
            <CButton type="reset" size="sm" color="danger"><CIcon name="cil-ban"/> Reset</CButton>
          </CCardFooter>
        </CCard>
        <CCard>
          <CCardHeader>
            Input <strong>Sizes</strong>
          </CCardHeader>
          <CCardBody>
            <CInput
              label="Small input"
              size="sm"
              horizontal
              placeholder="size='sm'"
            />
            <CInput
              label="Default input"
              horizontal
              placeholder="normal"
            />
            <CInput
              label="Large input"
              size="lg"
              horizontal
              placeholder="size='lg'"
            />
          </CCardBody>
          <CCardFooter>
            <CButton type="submit" size="sm" color="primary"><CIcon name="cil-check-circle"/> Submit</CButton>
            <CButton type="reset" size="sm" color="danger"><CIcon name="cil-ban"/> Reset</CButton>
          </CCardFooter>
        </CCard>
      </CCol>
    </CRow>


  </div>
</template>

<script>
export default {
  name: 'Typography'
}
</script>
